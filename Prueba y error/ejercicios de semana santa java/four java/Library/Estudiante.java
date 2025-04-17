package Library;

public class Estudiante {
    private String id, nombres, apellidos, direccion, telefono, rh;
    private Licencia licencia;

    public Estudiante(String id, String nombres, String apellidos, String direccion, String telefono, String rh, Licencia licencia) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.rh = rh;
        this.licencia = licencia;
    }

    public String getInformacion() {
        return "Estudiante: " + nombres + " " + apellidos + "\n" +
               "Identificación: " + id + "\n" +
               "Dirección: " + direccion + "\n" +
               "Teléfono: " + telefono + "\n" +
               "RH: " + rh + "\n" +
               licencia.detallesLicencia();
    }
}