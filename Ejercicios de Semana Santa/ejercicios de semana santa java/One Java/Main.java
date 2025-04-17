import Library.Empleado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cédula: ");
        String cedula = sc.nextLine();
        System.out.print("Salario base: ");
        double salarioBase = sc.nextDouble();
        System.out.print("Horas extra diurnas: ");
        int hed = sc.nextInt();
        System.out.print("Horas extra nocturnas: ");
        int hen = sc.nextInt();
        System.out.print("Horas extra festivas: ");
        int hef = sc.nextInt();
        System.out.print("Nivel de riesgo (1 a 5): ");
        int riesgo = sc.nextInt();

        Empleado emp = new Empleado(nombre, cedula, salarioBase, hed, hen, hef, riesgo);
        emp.mostrarDatos();
    }
}
