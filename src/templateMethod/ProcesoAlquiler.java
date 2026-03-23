package templatemethod;

public abstract class ProcesoAlquiler {
    
    public final void registrarServicio() {
        validarCliente();
        calcularCosto();
        confirmarServicio();
    }

    protected abstract void validarCliente();
    protected abstract void calcularCosto();
    protected abstract void confirmarServicio();
}
