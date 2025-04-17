package Library;

public class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(String nombre, double sueldoBase, double subsidio, int riesgo) {
        super(nombre, sueldoBase, subsidio, riesgo);
    }

    @Override
    public double calcularPago(double horasExtras, double totalDescuentos) {
        return super.calcularPago(horasExtras, totalDescuentos);
    }
}
