import java.util.Scanner;
import Library.Licencia;
import Library.LicenciaA;
import Library.LicenciaB;
import Library.LicenciaC;
import Library.Estudiante;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se crea el estudiante
        System.out.println("=== Registro Instituto de Conducción ===");

        //  datos del estudiante
        System.out.print("Identificación: ");
        String id = scanner.nextLine();

        System.out.print("Nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("RH: ");
        String rh = scanner.nextLine();

        // Se solicita el tipo de licencia
        System.out.println("\nTipo de Licencia:");
        System.out.println("1. LicenciaA (Motocicletas)");
        System.out.println("2. LicenciaB (Vehículos particulares)");
        System.out.println("3. LicenciaC (Servicio público)");

        // se lee la opción del usuario
        System.out.print("Seleccione [1-3]: ");
        String opcion = scanner.nextLine().toUpperCase();  // Convertir la entrada a mayúsculas para manejar 'C', 'B', 'A'

        Licencia licenciaSeleccionada = null;

        // Asignar licencia según la opción seleccionada
        switch (opcion) {
            case "1":
            case "A":
                licenciaSeleccionada = new LicenciaA();  // Licencia A
                break;
            case "2":
            case "B":
                licenciaSeleccionada = new LicenciaB();  
                break;
            case "3":
            case "C":
                licenciaSeleccionada = new LicenciaC();  
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        // Retififcar que se haya asignado una licencia válida
        if (licenciaSeleccionada != null) {
            // Crear el estudiante con la licencia seleccionada
            Estudiante estudiante = new Estudiante(id, nombres, apellidos, direccion, telefono, rh, licenciaSeleccionada);
            
            // Mostrar la información del estudiante
            System.out.println("\nInformación del Estudiante:");
            System.out.println(estudiante.getInformacion());
        }

        scanner.close();
    }
}