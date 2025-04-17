package Library;

//  Segunda Ley de Newton (F = m * a)
public class SegundaLey extends LeyNewton {

    public SegundaLey() {
        super("Segunda Ley de Newton - F = m * a");
    }

    @Override
    public String explicarLey() {
        return "La fuerza es el producto de la masa por la aceleración: F = m * a.";
    }

    @Override
    public String calcular(double... valores) {
        if (valores.length < 2) {
            return "Error: se necesitan la masa y la aceleración para calcular la fuerza.";
        }
        double masa = valores[0];
        double aceleracion = valores[1];
        double fuerza = masa * aceleracion;
        return "Fuerza calculada: " + fuerza + " N (F = " + masa + " kg * " + aceleracion + " m/s²)";
    }
}