package Library;

public class Empleado extends Persona {
    private double salarioBase;
    private int horasExtraDiurnas;
    private int horasExtraNocturnas;
    private int horasExtraFestivas;
    private int nivelRiesgo;

    public Empleado(String nombre, String cedula, double salarioBase, int horasExtraDiurnas,
                    int horasExtraNocturnas, int horasExtraFestivas, int nivelRiesgo) {
        super(nombre, cedula);
        this.salarioBase = salarioBase;
        this.horasExtraDiurnas = horasExtraDiurnas;
        this.horasExtraNocturnas = horasExtraNocturnas;
        this.horasExtraFestivas = horasExtraFestivas;
        this.nivelRiesgo = nivelRiesgo;
    }

    public double calcularHorasExtras() {
        return (horasExtraDiurnas * salarioBase / 240 * 1.25) +
               (horasExtraNocturnas * salarioBase / 240 * 1.75) +
               (horasExtraFestivas * salarioBase / 240 * 2.0);
    }

    public double calcularSubsidio() {
        double smmlv = 1300000;
        return salarioBase < (2 * smmlv) ? smmlv : 0;
    }

    public double calcularDeducciones() {
        double salud = salarioBase * 0.04;
        double pension = salarioBase * 0.04;
        double arl = Descuentos.calcularARL(salarioBase, nivelRiesgo);
        return salud + pension + arl;
    }

    public double calcularPago() {
        return salarioBase + calcularHorasExtras() + calcularSubsidio() - calcularDeducciones();
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Empleado: %s (%s)%n", nombre, cedula);
        System.out.printf("Pago Total: $%,.2f COP%n", calcularPago());
    }
}
