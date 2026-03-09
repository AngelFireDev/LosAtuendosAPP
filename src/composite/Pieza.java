package composite;

public class Pieza {
    
    private String nombre;

    public Pieza(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarInfo() {
        System.out.println("Pieza: " + nombre);
    }
}