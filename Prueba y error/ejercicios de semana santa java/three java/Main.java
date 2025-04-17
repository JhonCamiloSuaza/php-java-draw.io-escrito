import Library.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // instancias de las leyes
        LeyNewton ley1 = new PrimeraLey();
        LeyNewton ley2 = new SegundaLey();
        LeyNewton ley3 = new TerceraLey();

        Simulador simulador = new Simulador();

        // menú de selección que hay para mostrar 
        System.out.println("Selecciona una de las tres leyes de Newton:");
        System.out.println("1. Primera Ley de Newton (Inercia)");
        System.out.println("2. Segunda Ley de Newton (F = m * a)");
        System.out.println("3. Tercera Ley de Newton (Acción y Reacción)");

        // opción seleccionada por el usuario
        int opcion = scanner.nextInt();

        // Ejecutar según la opción seleccionada
        switch (opcion) {
            case 1: // Primera Ley
                manejarEntrada("Primera Ley de Newton - Inercia", scanner, ley1, simulador);
                break;
            case 2: // Segunda Ley
                manejarEntrada("Segunda Ley de Newton - F = m * a", scanner, ley2, simulador);
                break;
            case 3: // Tercera Ley
                manejarEntrada("Tercera Ley de Newton - Acción y Reacción", scanner, ley3, simulador);
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 3.");
                break;
        }

        scanner.close();
    }

    //  manejar la entrada de datos para cada ley
    private static void manejarEntrada(String leyNombre, Scanner scanner, LeyNewton ley, Simulador simulador) {
        System.out.println("Has seleccionado " + leyNombre + ".");
        double[] valores;

        // Solicitar los valores dependiendo de la ley seleccionada
        if (ley instanceof PrimeraLey) {
            System.out.print("Introduce la fuerza (F): ");
            double fuerza = scanner.nextDouble();
            valores = new double[]{fuerza};
        } else if (ley instanceof SegundaLey) {
            System.out.print("Introduce la masa (m) en kg: ");
            double masa = scanner.nextDouble();
            System.out.print("Introduce la aceleración (a) en m/s²: ");
            double aceleracion = scanner.nextDouble();
            valores = new double[]{masa, aceleracion};
        } else { // Tercera Ley
            System.out.print("Introduce la fuerza de acción (F): ");
            double fuerzaAccion = scanner.nextDouble();
            valores = new double[]{fuerzaAccion};
        }

        // Mostrar el resultado utilizando el simulador
        simulador.mostrarLey(ley, valores);
    }
}