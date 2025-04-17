package Library;

public class Simulador {
    public void mostrarUsuario(Usuario usuario) {
        System.out.println("===== Registro de Usuario =====");
        System.out.println("Usuario: " + usuario.getNombres() + " " + usuario.getApellidos());
        System.out.println("Identificación: " + usuario.getIdentificacion());
        System.out.println("Peso: " + usuario.getPeso() + " kg");
        System.out.println("Estatura: " + usuario.getEstatura() + " m");
        
        
        System.out.println(usuario.getPlan().detalles());
        System.out.println();
    }
}


