package Library;

public class PlanMedio extends Plan {
    public PlanMedio() {
        super("Medio", "Acceso + Clases dirigidas", 80000);
    }

    @Override
    public String detalles() {
        return "Plan: " + getNombre() + "\n" +
               "Servicios incluidos: " + getServicios() + "\n" +
               "Costo mensual: $" + String.format("%,.0f", getPrecio());
    }
}