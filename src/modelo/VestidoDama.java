package modelo;

import java.util.ArrayList;
import java.util.List;
import composite.Pieza;

public class VestidoDama extends Prenda {
    private List<Pieza> piezas = new ArrayList<>();

    public void agregarPieza(Pieza pieza) {
        piezas.add(pieza);
    }

    public void eliminarPieza(Pieza pieza) {
        piezas.remove(pieza);
    }

    public void mostrarInfo() {
        System.out.println("El vestido de dama cuenta con las siguientes piezas: ");
        
        for (Pieza p: piezas) {
            p.mostrarInfo();
        }
    }
}