public class Rectangle extends GeometricFigure {
    private double base;
    private double height;

    public Rectangle(double base, double height) {
        super("Rectangle");
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return base * height;
    }
}
