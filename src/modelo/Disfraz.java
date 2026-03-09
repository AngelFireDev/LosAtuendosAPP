package modelo;

public class Disfraz extends Prenda {
    private String tipo;

    public Disfraz(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("Disfraces de varios tipos: " + tipo);
    }
}