package modelo;

import composite.ComponentePrenda;

public class Disfraz extends Prenda implements ComponentePrenda {
    private String nombre;

    public Disfraz(String referencia, String color, String marca, String talla, double valorAlquiler,
                   String nombre) {
        super(referencia, color, marca, talla, valorAlquiler);
        this.nombre = nombre;
    }

    public Disfraz() {
        super("", "", "", "", 0.0);
        this.nombre = "";
    }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    public void agregarPieza(ComponentePrenda pieza) {
        throw new UnsupportedOperationException("Disfraz no puede contener piezas");
    }

    public String toString() {
        return super.toString() + " Disfraz [nombre=" + nombre + "]";
    }
}
