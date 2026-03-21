package modelo;

import composite.ComponentePrenda;

public class TrajeCaballero extends Prenda implements ComponentePrenda {
    private String tipo;
    private String accesorio;

    public TrajeCaballero(String referencia, String color, String marca, String talla, double valorAlquiler,
                          String tipo, String accesorio) {
        super(referencia, color, marca, talla, valorAlquiler);
        this.tipo = tipo;
        this.accesorio = accesorio;
    }

    public TrajeCaballero() {
        super("", "", "", "", 0.0);
        this.tipo = "";
        this.accesorio = "";
    }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    public void agregarPieza(ComponentePrenda pieza) {
        throw new UnsupportedOperationException("TrajeCaballero no puede contener piezas");
    }

    public String toString() {
        return super.toString() + " TrajeCaballero [tipo=" + tipo + ", accesorio=" + accesorio + "]";
    }
}
