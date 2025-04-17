package Library;

public class PlanBasico extends Plan {
    public PlanBasico() {
        super("Básico", "Acceso general", 50000);
    }

    @Override
    public String detalles() {
        return "Plan: " + getNombre() + "\n" +
               "Servicios incluidos: " + getServicios() + "\n" +
               "Costo mensual: $" + String.format("%,.0f", getPrecio());
    }
}
