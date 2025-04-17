import Library.Plan;
import Library.Usuario;
import Library.Simulador;
import Library.PlanBasico;
import Library.PlanMedio;
import Library.PlanPremium;

public class Main {
    public static void main(String[] args) {
        // Definir los planes disponibles
        Plan basico = new PlanBasico();
        Plan medio = new PlanMedio();
        Plan premium = new PlanPremium();

        // Registrar usuarios con sus datos
        Usuario usuario1 = new Usuario("C.C 1082301347", "Alberto", "Pérez", 70, 1.75, basico);
        Usuario usuario2 = new Usuario("C.C 1029341423", "Maria", "Cárdenas", 60, 1.65, medio);
        Usuario usuario3 = new Usuario("C.C 1760472860", "Pedro", "Ramírez", 80, 1.85, premium);

        // Mostrar información de cada usuario usando el simulador
        Simulador simulador = new Simulador();
        simulador.mostrarUsuario(usuario1);
        simulador.mostrarUsuario(usuario2);
        simulador.mostrarUsuario(usuario3);
    }
}
