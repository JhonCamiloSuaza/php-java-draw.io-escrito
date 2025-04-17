import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su identificación: ");
        String id = sc.nextLine();

        System.out.print("Ingrese su salario base: ");
        double salarioBase = Double.parseDouble(sc.nextLine().replace(".", "").replace(",", "."));

        System.out.print("Horas extra diurnas: ");
        int extraDiurnas = sc.nextInt();

        System.out.print("Horas extra nocturnas: ");
        int extraNocturnas = sc.nextInt();

        System.out.print("Horas extra festivas: ");
        int extraFestivas = sc.nextInt();

        System.out.print("Nivel de riesgo (1 a 5): ");
        int riesgo = sc.nextInt();

        Empleado empleado = new Empleado(nombre, id, salarioBase, extraDiurnas, extraNocturnas, extraFestivas, riesgo);
        empleado.mostrarDetalles();
    }
}