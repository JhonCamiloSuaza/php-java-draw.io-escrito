package Library;

public class Simulador {

    public void mostrarLey(LeyNewton ley, double[] valores) {
        //  nombre de la ley
        System.out.println("===== " + ley.getNombre() + " =====");
        //  de la ley
        System.out.println(ley.explicarLey());
        //  cálculo y mostrar resultado
        System.out.println(ley.calcular(valores));
    }
}
