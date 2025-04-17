package Library;

// Clase abstracta para las Leyes de Newton
public abstract class LeyNewton {
    private String nombre;

    public LeyNewton(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    // cada ley debe implementar para explicacion para la ley la ley
    public abstract String explicarLey();

    // cada ley debe implementar para hacer el cálculo
    public abstract String calcular(double... valores);
}
