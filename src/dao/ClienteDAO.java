package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

public class ClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    public void registrar(Cliente c) {
        clientes.add(c);
    }

    public Cliente consultarPorId(int id) {
        for (Cliente c : clientes) {
            if (c.getId() == id) return c;
        }
        return null;
    }

    public List<Cliente> listarTodos() {
        return clientes;
    }
}
