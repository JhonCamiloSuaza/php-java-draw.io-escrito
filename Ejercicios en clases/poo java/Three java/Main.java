public class Main {
    public static void main(String[] args) {
        // Sueldo de Antonio: $1.900.000 -> significa valorDia * dias = 95000 * 20
        Persona persona = new Persona("Antonio", 95000.0, 20);
        Descuentos descuentos = new Descuentos(95000.0, 100000.0, 50000.0);

        SueldoFinal calculadora = new SueldoFinal();
        calculadora.calcularTotal(persona, descuentos);
    }
}