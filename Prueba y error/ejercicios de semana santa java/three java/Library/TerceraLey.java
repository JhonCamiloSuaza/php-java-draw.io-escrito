package Library;

//  (Acción y Reacción)
public class TerceraLey extends LeyNewton {

    public TerceraLey() {
        super("Tercera Ley de Newton - Acción y Reacción");
    }

    @Override
    public String explicarLey() {
        return "A toda acción corresponde una reacción igual y contraria.";
    }

    @Override
    public String calcular(double... valores) {
        if (valores.length < 1) {
            return "Error: se necesita una fuerza de acción para calcular la reacción.";
        }
        double fuerza = valores[0];
        return "Fuerza de acción: " + fuerza + " N\nFuerza de reacción: " + (-fuerza) + " N";
    }
}