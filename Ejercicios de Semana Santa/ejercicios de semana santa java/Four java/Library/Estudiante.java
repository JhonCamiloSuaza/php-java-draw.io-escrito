package Library;

public class Estudiante extends Persona {
    private Licencia licencia;

    public Estudiante(String id, String nombre, String apellido, String direccion, String telefono, String rh, Licencia licencia) {
        super(id, nombre, apellido, direccion, telefono, rh);
        this.licencia = licencia;
    }

    public void mostrarDetalles() {
        System.out.println("\n--- Detalles del Estudiante ---");
        System.out.println("Nombre: " + nombre + " " + apellido);
        System.out.println("Identificación: " + id);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Dirección: " + direccion);
        System.out.println("RH: " + rh);
        licencia.mostrarDetalles();
    }
}
