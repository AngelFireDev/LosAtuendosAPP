package dao;

import modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private static ClienteDAO instancia;

    private List<Cliente> clientes;

    public ClienteDAO() {
        clientes = new ArrayList<>();
    }

    public static ClienteDAO getInstancia() {
        if (instancia == null) {
            instancia = new ClienteDAO();
        }
        return instancia;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarClientes() {
        return clientes;
    }

    public void deleteCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    public void deleteClienteById(int id) {
        clientes.removeIf(c -> c.getId() == id);
    }
}
