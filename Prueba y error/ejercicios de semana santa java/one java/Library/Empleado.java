package Library;

public class Empleado {
    protected String nombre;
    protected double sueldoBase;
    protected double subsidio;
    protected int riesgo;

    public Empleado(String nombre, double sueldoBase, double subsidio, int riesgo) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.subsidio = subsidio;
        this.riesgo = riesgo;
    }

    public String getNombre() { return nombre; }
    public double getSueldoBase() { return sueldoBase; }
    public double getSubsidio() { return subsidio; }
    public int getRiesgo() { return riesgo; }

    public double calcularPago(double horasExtras, double totalDescuentos) {
        return sueldoBase + subsidio + horasExtras - totalDescuentos;
    }
}
