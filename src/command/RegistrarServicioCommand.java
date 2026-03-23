package command;

import negocio.NegocioAlquiler;
import modelo.ServicioAlquiler;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Prenda;
import java.util.Date;
import java.util.List;

public class RegistrarServicioCommand implements Command {
    private NegocioAlquiler negocio;
    private String cedulaCliente;
    private String cedulaEmpleado;
    private List<Prenda> prendas;
    private Date fechaAlquiler;

    public RegistrarServicioCommand(NegocioAlquiler negocio, String cedulaCliente, String cedulaEmpleado,
                                    List<Prenda> prendas, Date fechaAlquiler) {
        this.negocio = negocio;
        this.cedulaCliente = cedulaCliente;
        this.cedulaEmpleado = cedulaEmpleado;
        this.prendas = prendas;
        this.fechaAlquiler = fechaAlquiler;
    }

    @Override
    public void ejecutar() {
        negocio.registrarServicio(cedulaCliente, cedulaEmpleado, prendas, fechaAlquiler);
    }
}
