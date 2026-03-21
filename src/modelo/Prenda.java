package modelo;

public abstract class Prenda {
    private String referencia;
    private String color;
    private String marca;
    private String talla;
    private double valorAlquiler;

    public Prenda(String referencia, String color, String marca, String talla, double valorAlquiler) {
        this.referencia = referencia;
        this.color = color;
        this.marca = marca;
        this.talla = talla;
        this.valorAlquiler = valorAlquiler;
    }

    public String getReferencia() { return referencia; }
    public String getColor() { return color; }
    public String getMarca() { return marca; }
    public String getTalla() { return talla; }
    public double getValorAlquiler() { return valorAlquiler; }

    @Override
    public String toString() {
        return "Prenda [referencia=" + referencia + ", color=" + color + ", marca=" + marca +
               ", talla=" + talla + ", valorAlquiler=" + valorAlquiler + "]";
    }

    public void mostrarInfo() {
        System.out.println(this.toString());
    }
}
