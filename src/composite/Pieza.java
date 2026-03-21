package composite;

import java.util.ArrayList;
import java.util.List;

public class Pieza implements ComponentePrenda {
    private String nombre;
    private List<ComponentePrenda> componentes = new ArrayList<>();

    public Pieza(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Pieza: " + nombre);
        for (ComponentePrenda c : componentes) {
            c.mostrarInfo();
        }
    }

    public void agregarPieza(ComponentePrenda pieza) {
        componentes.add(pieza);
    }
}
