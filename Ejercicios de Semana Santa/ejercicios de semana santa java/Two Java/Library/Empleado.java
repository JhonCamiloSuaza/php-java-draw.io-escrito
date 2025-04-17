public class Empleado {
    private String nombre;
    private String id;
    private double salarioBase;
    private int extraDiurnas;
    private int extraNocturnas;
    private int extraFestivas;
    private int nivelRiesgo;
    private PlanillaPago planilla;
    public static final double SMMLV = 1300000;

    public Empleado(String nombre, String id, double salarioBase, int extraDiurnas, int extraNocturnas, int extraFestivas, int nivelRiesgo) {
        this.planilla = new PlanillaPago();
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
        this.extraDiurnas = extraDiurnas;
        this.extraNocturnas = extraNocturnas;
        this.extraFestivas = extraFestivas;
        this.nivelRiesgo = nivelRiesgo;
    }

    public double calcularSubsidio() {
        return (salarioBase < 2 * SMMLV) ? SMMLV : 0;
    }

    public double calcularHorasExtras() {
        double valorHora = salarioBase / 240;
        double pagoDiurnas = extraDiurnas * valorHora * 1.25;
        double pagoNocturnas = extraNocturnas * valorHora * 1.75;
        double pagoFestivas = extraFestivas * valorHora * 2.00;
        return pagoDiurnas + pagoNocturnas + pagoFestivas;
    }

    public double calcularDeducciones() {
        double salud = salarioBase * 0.04;
        double pension = salarioBase * 0.04;
        double[] arlPorcentajes = {0.00522, 0.01044, 0.02436, 0.04350, 0.06960};
        double arl = salarioBase * arlPorcentajes[nivelRiesgo - 1];
        return salud + pension + arl;
    }

    public double calcularPagoTotal() {
        double subsidio = calcularSubsidio();
        double extras = calcularHorasExtras();
        double deducciones = calcularDeducciones();
        return salarioBase + subsidio + extras - deducciones;
    }

    public void mostrarDetalles() {
        System.out.println("\n--- Detalles del Empleado ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificación: " + id);
        System.out.println("Salario Base: " + planilla.formatearCOP(salarioBase));
        System.out.println("Subsidio: " + planilla.formatearCOP(calcularSubsidio()));
        System.out.println("Pago Horas Extras: " + planilla.formatearCOP(calcularHorasExtras()));
        System.out.println("Descuentos: " + planilla.formatearCOP(calcularDeducciones()));
        System.out.println("Pago Total: " + planilla.formatearCOP(calcularPagoTotal()));
    }
}