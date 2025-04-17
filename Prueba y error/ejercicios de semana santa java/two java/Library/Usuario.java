package Library;

public class Usuario {
    private String identificacion;
    private String nombres;
    private String apellidos;
    private double peso;
    private double estatura;
    private Plan plan;

    public Usuario(String identificacion, String nombres, String apellidos, double peso, double estatura, Plan plan) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.peso = peso;
        this.estatura = estatura;
        this.plan = plan;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public double getPeso() {
        return peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public Plan getPlan() {
        return plan;
    }

    // Método para mostrar detalles del usuario
    public String mostrarDetalles() {
        return "Usuario: " + nombres + " " + apellidos + "\n" +
               "Identificación: " + identificacion + "\n" +
               "Peso: " + peso + " kg\n" +
               "Estatura: " + estatura + " m\n" +
               plan.detalles();
    }
}
