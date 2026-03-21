package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Prenda;

public class PrendaDAO {
    private List<Prenda> prendas = new ArrayList<>();

    public void registrar(Prenda p) {
        prendas.add(p);
    }

    public Prenda consultarPorReferencia(String referencia) {
        for (Prenda p : prendas) {
            if (p.getReferencia().equals(referencia)) return p;
        }
        return null;
    }

    public List<Prenda> listarTodos() {
        return prendas;
    }

    public List<Prenda> consultarPorTalla(String talla) {
        List<Prenda> resultado = new ArrayList<>();
        for (Prenda p : prendas) {
            if (p.getTalla().equalsIgnoreCase(talla)) {
                resultado.add(p);
            }
        }
        return resultado;
    }
}
