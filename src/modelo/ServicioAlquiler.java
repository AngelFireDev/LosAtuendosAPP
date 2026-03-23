package modelo;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import observer.Observer; 

public class ServicioAlquiler {
    private int numeroServicio;
    private Date fechaSolicitud;
    private Date fechaAlquiler;
    private Cliente cliente;
    private Empleado empleado;
    private List<Prenda> prendas;

    private List<Observer> observadores = new ArrayList<>();

    public ServicioAlquiler(int numeroServicio, Date fechaSolicitud, Date fechaAlquiler,
                            Cliente cliente, Empleado empleado, List<Prenda> prendas) {
        this.numeroServicio = numeroServicio;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaAlquiler = fechaAlquiler;
        this.cliente = cliente;
        this.empleado = empleado;
        this.prendas = prendas;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public List<Prenda> getPrendas() {
        return prendas;
    }

    public void agregarObservador(Observer o) {
        observadores.add(o);
    }

    public void notificarObservadores(String mensaje) {
        for (Observer o : observadores) {
            o.actualizar(mensaje);
        }
    }

    public String toString() {
        return "ServicioAlquiler{" +
                "numeroServicio=" + numeroServicio +
                ", cliente=" + cliente.getNombre() +
                ", empleado=" + empleado.getNombre() +
                ", fechaAlquiler=" + fechaAlquiler +
                ", prendas=" + prendas +
                '}';
    }

    public int getNumeroServicio() {
    return numeroServicio;
}

}
