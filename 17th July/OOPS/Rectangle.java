package OOPS;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

class RectangleExample {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("Rectangle properties:");
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Height: " + rectangle.getHeight());
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}
