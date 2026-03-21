package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.ServicioAlquiler;

public class ServicioAlquilerDAO {
    private List<ServicioAlquiler> servicios = new ArrayList<>();

    public void registrar(ServicioAlquiler s) {
        servicios.add(s);
    }

    public ServicioAlquiler consultarPorNumero(int numero) {
        for (ServicioAlquiler s : servicios) {
            if (s.getNumeroServicio() == numero) return s;
        }
        return null;
    }

    public List<ServicioAlquiler> listarTodos() {
        return servicios;
    }
}
