package modelo;


public class TrajeCaballero extends Prenda {
    private String tipo;

    public TrajeCaballero(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarInfo() {
        System.out.println("Trajes de caballero de los tipos: " + tipo);
    }
}