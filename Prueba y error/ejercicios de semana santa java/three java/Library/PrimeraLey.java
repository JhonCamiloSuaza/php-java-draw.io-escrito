package Library;

//  la Primera Ley de Newton (Inercia)
public class PrimeraLey extends LeyNewton {

    public PrimeraLey() {
        super("Primera Ley de Newton - Inercia");
    }

    @Override
    public String explicarLey() {
        return "Si F = 0, el objeto mantiene su estado (reposo o movimiento uniforme).";
    }

    @Override
    public String calcular(double... valores) {
        if (valores.length < 1) {
            return "Error: se necesita la fuerza para determinar el estado del objeto.";
        }
        double fuerza = valores[0];
        if (fuerza == 0) {
            return "El objeto mantiene su estado (reposo o movimiento uniforme).";
        } else {
            return "El objeto cambiará su estado debido a la fuerza aplicada.";
        }
    }
}