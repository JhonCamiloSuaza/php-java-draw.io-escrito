public class Main {
    public static void main(String[] args) {


        Triangle triangle = new Triangle(15, 9);
        Square square = new Square(7);
        Rectangle rectangle = new Rectangle(8, 1);
        Circle circle = new Circle(2);

        System.out.println();
        System.out.println(triangle.getName());
        System.out.println("Base: " + triangle.getBase());
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Area: " + triangle.calculateArea());
        System.out.println();

        System.out.println(square.getName());
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.calculateArea());
        System.out.println();

        System.out.println(rectangle.getName());
        System.out.println("Base: " + rectangle.getBase());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println();

        System.out.println(circle.getName());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
    }
}
