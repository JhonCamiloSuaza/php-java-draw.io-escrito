package Library;

public class LicenciaA extends Licencia {
    public LicenciaA() {
        this.tipo = "A";
        this.costo = 800000;
        this.duracion = 6;
    }

    public void mostrarDetalles() {
        System.out.println("\n--- Detalles de la Licencia ---");
        System.out.println("Tipo: " + tipo + " (Motocicletas)");
        System.out.println("Costo: " + String.format("%,.2f COP", costo));
        System.out.println("Duración: " + duracion + " meses");
    }
}
