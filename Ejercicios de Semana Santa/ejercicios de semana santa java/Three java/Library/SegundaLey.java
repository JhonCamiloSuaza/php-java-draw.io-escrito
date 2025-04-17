
package Library;

import java.util.Scanner;

public class SegundaLey extends LeyNewton {
    double m, a;
    public void ingresarDatos() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la masa (kg): ");
        m = sc.nextDouble();
        System.out.print("Ingrese la aceleración (m/s²): ");
        a = sc.nextDouble();
    }
    public void calcular() {
        double f = m * a;
        System.out.printf("Fuerza aplicada: %.2f N\n", f);
    }
}
