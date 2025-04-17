package Library;

public class Descuentos {
    public static double calcularARL(double sueldo, int riesgo) {
        switch (riesgo) {
            case 1: return sueldo * 0.00522;
            case 2: return sueldo * 0.01044;
            case 3: return sueldo * 0.02436;
            case 4: return sueldo * 0.04350;
            case 5: return sueldo * 0.06960;
            default: return 0;
        }
    }
}
