package negocio;

import dao.ClienteDAO;
import modelo.Cliente;

public class NegocioAlquiler {
    private static NegocioAlquiler instancia;

    private NegocioAlquiler() {}

    public static NegocioAlquiler getInstance() {
        if (instancia == null) {
            instancia = new NegocioAlquiler();
        }
        return instancia;
    }

    public void registrarCliente(Cliente cliente) {
        ClienteDAO dao = new ClienteDAO();
        dao.agregarCliente(cliente);
    }
}
