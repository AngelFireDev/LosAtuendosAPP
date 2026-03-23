package templatemethod;

public class AlquilerClienteVIP extends ProcesoAlquiler {

    protected void validarCliente() {
        System.out.println("Validando cliente VIP...");
    }

    protected void calcularCosto() {
        System.out.println("Calculando costo con beneficios VIP...");
    }

    protected void confirmarServicio() {
        System.out.println("Servicio confirmado para cliente VIP.");
    }
}
