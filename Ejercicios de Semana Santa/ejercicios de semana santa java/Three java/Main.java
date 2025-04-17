
import java.util.Scanner;
import Library.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione la Ley de Newton (1 / 2 / 3): ");
        int opcion = sc.nextInt();
        LeyNewton ley = null;
        switch (opcion) {
            case 1: ley = new PrimeraLey(); break;
            case 2: ley = new SegundaLey(); break;
            case 3: ley = new TerceraLey(); break;
            default: System.out.println("Opción inválida"); return;
        }
        ley.ingresarDatos();
        ley.calcular();
    }
}
