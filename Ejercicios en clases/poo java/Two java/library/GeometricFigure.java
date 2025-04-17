public abstract class GeometricFigure {
    private String name;

    public GeometricFigure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateArea();
}
