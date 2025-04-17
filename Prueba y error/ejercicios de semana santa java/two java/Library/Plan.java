package Library;

public abstract class Plan {
    private String nombre;
    private String servicios;
    private double precio;

    public Plan(String nombre, String servicios, double precio) {
        this.nombre = nombre;
        this.servicios = servicios;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getServicios() {
        return servicios;
    }

    public double getPrecio() {
        return precio;
    }

    // Método abstracto para obtener detalles específicos de cada plan
    public abstract String detalles();
}
