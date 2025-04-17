package Library;

public class Persona {
    protected String id;
    protected String nombre;
    protected String apellido;
    protected String direccion;
    protected String telefono;
    protected String rh;

    public Persona(String id, String nombre, String apellido, String direccion, String telefono, String rh) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rh = rh;
    }
}
