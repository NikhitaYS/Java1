abstract class Shape {
    public abstract double calculateArea();

    public void displayArea() {
        System.out.println("The area is: " + calculateArea());
    }
}
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
public class N6 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);

        System.out.print("Circle area: ");
        circle.displayArea();

        System.out.print("Rectangle area: ");
        rectangle.displayArea();
    }
}