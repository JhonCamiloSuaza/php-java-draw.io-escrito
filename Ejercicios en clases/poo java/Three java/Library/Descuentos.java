public class Descuentos {
    private double salud;
    private double pension;
    private double arl;

    public Descuentos(double salud, double pension, double arl) {
        this.salud = salud;
        this.pension = pension;
        this.arl = arl;
    }

    public double getSalud() {
        return salud;
    }

    public double getPension() {
        return pension;
    }

    public double getArl() {
        return arl;
    }

    public double totalDescuentos() {
        return salud + pension + arl;
    }
}