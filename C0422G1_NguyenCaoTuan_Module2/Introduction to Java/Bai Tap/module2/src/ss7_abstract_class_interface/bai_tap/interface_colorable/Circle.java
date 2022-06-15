package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class Circle extends Shape implements Resizeable{
    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle : radius = " + getRadius() + ", Area = " + getArea();
    }

    @Override
    public void resize(double percent){
        this.radius = this.radius*(percent/100);
    }
}
