package Library;

public class HorasExtras {
    private double valorHora;
    private int diurnas;
    private int nocturnas;
    private int festivas;

    public HorasExtras(double valorHora, int diurnas, int nocturnas, int festivas) {
        this.valorHora = valorHora;
        this.diurnas = diurnas;
        this.nocturnas = nocturnas;
        this.festivas = festivas;
    }

    public double calcularTotal() {
        double total = 0;
        total += diurnas * valorHora * 1.25;
        total += nocturnas * valorHora * 1.75;
        total += festivas * valorHora * 2.00;
        return total;
    }
}
