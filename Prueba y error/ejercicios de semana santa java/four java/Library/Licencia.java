package Library;

public abstract class Licencia {
    protected String tipo;
    protected int duracion;  // Duración en meses
    protected double costo;  // (COP)

    public abstract String detallesLicencia();  // Método abstracto para mostrar los detalles de la licencia
}
