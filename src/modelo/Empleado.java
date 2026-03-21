package modelo;

public class Empleado {
    private int id;
    private String identificacion;
    private String nombre;
    private String direccion; 
    private String telefono;
    private String correo;
    private String cargo;

    public Empleado(int id, String identificacion, String nombre, String direccion, String telefono, String correo, String cargo) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.cargo = cargo;
    }

    public int getId() { return id; }
    public String getIdentificacion() { return identificacion; }
    public String getNombre() { return nombre; }
    public String getDireccion() { return direccion; }
    public String getTelefono() { return telefono; }
    public String getCorreo() { return correo; }
    public String getCargo() { return cargo; }

    public String toString() {
        return "Empleado [id=" + id + 
               ", identificacion=" + identificacion + 
               ", nombre=" + nombre + 
               ", direccion=" + direccion + 
               ", telefono=" + telefono + 
               ", correo=" + correo +
               ", cargo=" + cargo + "]";
    }
}
