package Library;

public abstract class Persona {
    protected String nombre;
    protected String cedula;

    public Persona(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public abstract void mostrarDatos();
}
