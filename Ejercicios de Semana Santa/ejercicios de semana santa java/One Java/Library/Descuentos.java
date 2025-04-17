package Library;

public class Descuentos {
    public static double calcularARL(double salario, int nivel) {
        switch (nivel) {
            case 1: return salario * 0.00522;
            case 2: return salario * 0.01044;
            case 3: return salario * 0.02436;
            case 4: return salario * 0.04350;
            case 5: return salario * 0.06960;
            default: return 0;
        }
    }
}
