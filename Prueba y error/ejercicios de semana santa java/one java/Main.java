import Library.EmpleadoTiempoCompleto;
import Library.HorasExtras;
import Library.Descuentos;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto antonio = new EmpleadoTiempoCompleto("Antonio", 1900000.00, 170000.00, 2);

        HorasExtras extras = new HorasExtras(95000.0 / 8, 3, 2, 1);
        double totalExtras = extras.calcularTotal();

        double salud = 95000.0;
        double pension = 100000.00;
        double arl = Descuentos.calcularARL(antonio.getSueldoBase(), antonio.getRiesgo());
        double totalDescuentos = salud + pension + arl;

        double totalPagar = antonio.calcularPago(totalExtras, totalDescuentos);

        DecimalFormat formato = new DecimalFormat("#,###.00");

        System.out.println("Empleado: " + antonio.getNombre());
        System.out.println("Sueldo base: " + formato.format(antonio.getSueldoBase()));
        System.out.println("Subsidio: " + formato.format(antonio.getSubsidio()));
        System.out.println("Horas extras: " + formato.format(totalExtras));
        System.out.println("Descuentos:");
        System.out.println("  Salud: " + formato.format(salud));
        System.out.println("  Pensión: " + formato.format(pension));
        System.out.println("  ARL: " + formato.format(arl));
        System.out.println("Total a pagar: " + formato.format(totalPagar));
    }
}
