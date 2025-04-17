package Library;

public class LicenciaC extends Licencia {
    public LicenciaC() {
        this.tipo = "C";
        this.costo = 1500000;
        this.duracion = 10;
    }

    public void mostrarDetalles() {
        System.out.println("\n--- Detalles de la Licencia ---");
        System.out.println("Tipo: " + tipo + " (Vehículos de servicio público)");
        System.out.println("Costo: " + String.format("%,.2f COP", costo));
        System.out.println("Duración: " + duracion + " meses");
    }
}
