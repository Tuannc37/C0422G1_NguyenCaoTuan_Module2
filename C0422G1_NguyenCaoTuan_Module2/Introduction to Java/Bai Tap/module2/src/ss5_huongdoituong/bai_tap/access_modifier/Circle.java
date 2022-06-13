package ss5_huongdoituong.bai_tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    final double PI = 3.14;

    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return PI*radius*radius;
    }

    public double getPerimeter() {
        return 2*PI*radius;
    }
}
