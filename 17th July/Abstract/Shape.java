package Abstract;

public class Shape {

    double calculateArea() {
        return 0;
    }

    double calculatePerimeter() {
        return 0;
    }
}

class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Triangle extends Shape {

    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("The area of the circle is " + circle.calculateArea());
        System.out.println("The perimeter of the circle is " + circle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("The area of the triangle is " + triangle.calculateArea());
        System.out.println("The perimeter of the triangle is " + triangle.calculatePerimeter());
    }
}
