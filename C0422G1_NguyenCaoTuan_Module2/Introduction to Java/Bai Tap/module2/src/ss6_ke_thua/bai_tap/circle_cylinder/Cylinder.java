package ss5_ke_thua.bai_tap.circle_cylinder;

public class Cylinder extends Circle{
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getAreaCylinder() {
        return (height * getArea())/3;
    }

    @Override
    public String toString() {
        return "Cylinder :" + super.toString() + "\nHeight : " + getHeight() + "\nAreaCylinder : " + getAreaCylinder();
    }
}
