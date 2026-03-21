package negocio;

import java.util.LinkedList;
import java.util.List;
import modelo.Prenda;

public class Lavanderia {
    private LinkedList<Prenda> pendientes = new LinkedList<>();

    public void registrarPrenda(Prenda prenda, boolean prioridad) {
        if (prioridad) {
            pendientes.addFirst(prenda);
        } else {
            pendientes.addLast(prenda);
        }
        System.out.println("Prenda registrada en lavandería: " + prenda.getReferencia() + 
                           (prioridad ? " (PRIORIDAD)" : ""));
    }

    public List<Prenda> visualizarPendientes() {
        return pendientes;
    }

    public List<Prenda> enviarPrendas(int cantidad) {
        List<Prenda> enviadas = new LinkedList<>();
        for (int i = 0; i < cantidad && !pendientes.isEmpty(); i++) {
            enviadas.add(pendientes.removeFirst()); 
        }
        System.out.println("Prendas enviadas a lavandería: " + enviadas.size());
        return enviadas;
    }
}
