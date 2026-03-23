package modelo;
import observer.Observer;

public class Cliente implements Observer{
    private int id;
    private String identificacion;
    private String nombre;
    private String direccion; 
    private String telefono;
    private String correo;

    public Cliente(int id, String identificacion, String nombre, String direccion, String telefono, String correo) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public int getId() { return id; }
    public String getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }

    public String toString() {
        return "Cliente [id=" + id + 
               ", identificacion=" + identificacion + 
               ", nombre=" + nombre + 
               ", direccion=" + direccion + 
               ", telefono=" + telefono + 
               ", correo=" + correo + "]";
    }

     public void actualizar(String mensaje) {
        System.out.println("Cliente notificado: " + mensaje);
    }
}
