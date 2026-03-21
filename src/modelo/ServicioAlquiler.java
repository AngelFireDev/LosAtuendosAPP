package modelo;

import java.util.Date;
import java.util.List;

public class ServicioAlquiler {
    private int numeroServicio;
    private Date fechaSolicitud;
    private Date fechaAlquiler;
    private Cliente cliente;
    private Empleado empleado;
    private List<Prenda> prendas;

    public ServicioAlquiler(int numeroServicio, Date fechaSolicitud, Date fechaAlquiler,
                            Cliente cliente, Empleado empleado, List<Prenda> prendas) {
        this.numeroServicio = numeroServicio;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaAlquiler = fechaAlquiler;
        this.cliente = cliente;
        this.empleado = empleado;
        this.prendas = prendas;
    }

    public int getNumeroServicio() {
        return numeroServicio;
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

    @Override
    public String toString() {
        return "ServicioAlquiler{" +
                "numeroServicio=" + numeroServicio +
                ", cliente=" + cliente.getNombre() +
                ", empleado=" + empleado.getNombre() +
                ", fechaAlquiler=" + fechaAlquiler +
                ", prendas=" + prendas +
                '}';
    }
}
