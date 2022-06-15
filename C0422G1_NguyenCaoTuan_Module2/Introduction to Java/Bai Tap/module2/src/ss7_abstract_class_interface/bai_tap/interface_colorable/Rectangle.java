package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAreaRectangle() {
        return getWidth() * getHeight();
    }

    @Override
    public String toString() {
        return "Rectangle: width = " + getWidth() + " , length = " + getHeight() +", AreaRectangle = "+ getAreaRectangle();
    }

    @Override
    public void resize(double percent) {
        this.width = this.width*(percent/100);
        this.height = this.height*(percent/100);
    }
}
