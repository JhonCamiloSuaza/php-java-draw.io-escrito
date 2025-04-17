package Library;

public class PlanPremium extends Plan {
    public PlanPremium() {
        super("Premium", "Acceso + Clases + Entrenador + Zona húmeda", 120000);
    }

    @Override
    public String detalles() {
        return "Plan: " + getNombre() + "\n" +
               "Servicios incluidos: " + getServicios() + "\n" +
               "Costo mensual: $" + String.format("%,.0f", getPrecio());
    }
}