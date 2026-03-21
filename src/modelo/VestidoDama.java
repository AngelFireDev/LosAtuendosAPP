package modelo;

import composite.ComponentePrenda;

public class VestidoDama extends Prenda implements ComponentePrenda {
    private boolean pedreria;
    private boolean largo;
    private int piezas;

    public VestidoDama(String referencia, String color, String marca, String talla, double valorAlquiler,
                       boolean pedreria, boolean largo, int piezas) {
        super(referencia, color, marca, talla, valorAlquiler);
        this.pedreria = pedreria;
        this.largo = largo;
        this.piezas = piezas;
    }

    public VestidoDama() {
        super("", "", "", "", 0.0);
        this.pedreria = false;
        this.largo = false;
        this.piezas = 0;
    }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }

    public void agregarPieza(ComponentePrenda pieza) {
        throw new UnsupportedOperationException("VestidoDama no puede contener piezas");
    }

    public String toString() {
        return super.toString() + " VestidoDama [pedreria=" + pedreria + ", largo=" + largo + ", piezas=" + piezas + "]";
    }
}
