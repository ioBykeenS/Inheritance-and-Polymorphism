public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape("Purple");
        Square square = new Square(5, "Red");
        Circle circle = new Circle(12, "Green");
        Cylinder cylinder = new Cylinder(3, 12, "Blue");

        System.out.println("\n=== Square Details ===");
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.calculateArea());

        System.out.println("\n=== Circle Details ===");
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());

        System.out.println("\n=== Cylinder Details ===");
        System.out.println("Height: " + cylinder.getHeight());
        System.out.println("Radius: " + cylinder.getRadius());
        System.out.println("Volume: " + cylinder.calculateVolume());

        System.out.println("\n=== Polymorphism Demonstration (Shape Array) ===");
        Shape[] shapes = { shape, square, circle, cylinder };
        for (Shape s : shapes) {
            s.printInfo();
        }
    }
}
