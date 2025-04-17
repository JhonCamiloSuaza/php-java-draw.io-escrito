public class Persona {
    private String name;
    private double valorDia;
    private int diasTrabajados;

    public Persona(String name, double valorDia, int diasTrabajados) {
        this.name = name;
        this.valorDia = valorDia;
        this.diasTrabajados = diasTrabajados;
    }

    public String getName() {
        return name;
    }

    public double calcularSueldo() {
        return valorDia * diasTrabajados;
    }
}