import java.util.Scanner;
import Library.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su identificación: ");
        String id = sc.nextLine();

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Ingrese su dirección: ");
        String direccion = sc.nextLine();

        System.out.print("Ingrese su teléfono: ");
        String telefono = sc.nextLine();

        System.out.print("Ingrese su RH: ");
        String rh = sc.nextLine();

        System.out.print("Seleccione tipo de licencia (A / B / C): ");
        String tipo = sc.nextLine();

        Licencia licencia;
        if (tipo.equalsIgnoreCase("A")) {
            licencia = new LicenciaA();
        } else if (tipo.equalsIgnoreCase("B")) {
            licencia = new LicenciaB();
        } else {
            licencia = new LicenciaC();
        }

        Estudiante estudiante = new Estudiante(id, nombre, apellido, direccion, telefono, rh, licencia);
        estudiante.mostrarDetalles();
    }
}
