package negocio;

import dao.ClienteDAO;
import dao.EmpleadoDAO;
import dao.PrendaDAO;
import dao.ServicioAlquilerDAO;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Prenda;
import modelo.ServicioAlquiler;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import observer.Observer;
import strategy.EstrategiaCosto;
import strategy.CostoDescuento;
import templatemethod.ProcesoAlquiler;

public class NegocioAlquiler {
    private ClienteDAO clienteDAO;
    private EmpleadoDAO empleadoDAO;
    private PrendaDAO prendaDAO;
    private ServicioAlquilerDAO servicioDAO;
    private int consecutivoServicio = 1; 

    private EstrategiaCosto estrategiaCosto;
    private List<Observer> observadores = new ArrayList<>(); 

    public NegocioAlquiler() {
        clienteDAO = new ClienteDAO();
        empleadoDAO = new EmpleadoDAO();
        prendaDAO = new PrendaDAO();
        servicioDAO = new ServicioAlquilerDAO();
        estrategiaCosto = new CostoDescuento(); 
    }

    // Observer
    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    private void notificarObservadores(String mensaje) {
        for (Observer o : observadores) {
            o.actualizar(mensaje);
        }
    }

    // Strategy
    public void setEstrategiaCosto(EstrategiaCosto estrategia) {
        this.estrategiaCosto = estrategia;
    }

    public double calcularCostoServicio(List<Prenda> prendas) {
        return estrategiaCosto.calcularCosto(prendas);
    }

    // Template Method
    public void ejecutarProcesoAlquiler(ProcesoAlquiler proceso) {
        proceso.registrarServicio();
    }

    public void registrarCliente(Cliente c) {
        clienteDAO.registrar(c);
    }

    public void registrarEmpleado(Empleado e) {
        empleadoDAO.registrar(e);
    }

    public void registrarPrenda(Prenda p) {
        prendaDAO.registrar(p);
    }

    public void registrarServicio(String idCliente, String idEmpleado, List<Prenda> prendas, Date fechaAlquiler) {
        Cliente cliente = clienteDAO.listarTodos().stream()
                .filter(c -> c.getIdentificacion().equals(idCliente))
                .findFirst().orElse(null);

        Empleado empleado = empleadoDAO.listarTodos().stream()
                .filter(e -> e.getIdentificacion().equals(idEmpleado))
                .findFirst().orElse(null);

        if (cliente == null || empleado == null || prendas.isEmpty()) {
            System.out.println("Error: Cliente, empleado o prendas no válidos.");
            return;
        }

        ServicioAlquiler servicio = new ServicioAlquiler(
                consecutivoServicio++,
                new Date(), 
                fechaAlquiler,
                cliente,
                empleado,
                prendas
        );

        servicioDAO.registrar(servicio);
        System.out.println("Servicio registrado: " + servicio);

        notificarObservadores("Nuevo servicio registrado: " + servicio.getNumeroServicio());

        double costo = calcularCostoServicio(prendas);
        System.out.println("Costo calculado con estrategia actual: " + costo);
    }

    public ServicioAlquiler consultarServicioPorNumero(int numero) {
        return servicioDAO.consultarPorNumero(numero);
    }

    public List<ServicioAlquiler> consultarServiciosPorCliente(String idCliente) {
        return servicioDAO.listarTodos().stream()
            .filter(s -> s.getCliente().getIdentificacion().equals(idCliente))
            .toList();
    }

    public List<Prenda> consultarPrendasPorTalla(String talla) {
        return prendaDAO.consultarPorTalla(talla);
    }
}
