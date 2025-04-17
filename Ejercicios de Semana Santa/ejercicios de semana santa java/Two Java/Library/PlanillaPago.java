public class PlanillaPago {
    public String formatearCOP(double num) {
        return String.format("%,.2f", num).replace(",", "X").replace(".", ",").replace("X", ".");
    }
}