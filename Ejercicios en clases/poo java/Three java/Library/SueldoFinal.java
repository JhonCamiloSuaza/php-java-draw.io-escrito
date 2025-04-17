public class SueldoFinal {

    private final double SUBSIDIO_TRANSPORTE = 170000.0;

    public void calcularTotal(Persona persona, Descuentos descuentos) {
        double sueldoBase = persona.calcularSueldo();
        double salud = descuentos.getSalud();
        double pension = descuentos.getPension();
        double arl = descuentos.getArl();
        double totalDescuentos = descuentos.totalDescuentos();

        double totalPagar = sueldoBase - totalDescuentos + SUBSIDIO_TRANSPORTE;

        // Mostrar resultados
        System.out.printf("Subsidio de transporte: $%,.2f%n", SUBSIDIO_TRANSPORTE);
        System.out.println("Empleado: " + persona.getName());
        System.out.printf("Sueldo: $%,.2f%n", sueldoBase);
        System.out.printf("Salud: $%,.2f%n", salud);
        System.out.printf("Pensión: $%,.2f%n", pension);
        System.out.printf("ARL: $%,.2f%n", arl);
        System.out.printf("Total a pagar: $%,.2f%n", totalPagar);
    }
}