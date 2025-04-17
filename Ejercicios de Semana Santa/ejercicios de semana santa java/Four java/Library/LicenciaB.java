package Library;

public class LicenciaB extends Licencia {
    public LicenciaB() {
        this.tipo = "B";
        this.costo = 1200000;
        this.duracion = 8;
    }

    public void mostrarDetalles() {
        System.out.println("\n--- Detalles de la Licencia ---");
        System.out.println("Tipo: " + tipo + " (Vehículos particulares)");
        System.out.println("Costo: " + String.format("%,.2f COP", costo));
        System.out.println("Duración: " + duracion + " meses");
    }
}
