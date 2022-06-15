package ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class Square extends Shape  {
    private double side = 1.0;

    public Square() {

    }

    public Square(double side){
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side){
        this.side = side;
    }

    public double getAreaSquare() {
        return getSide() * getSide();
    }

    @Override
    public String toString(){
        return "AreaSquare ="
                + getAreaSquare()
                + ", which is a subclass of "
                + super.toString();
    }

}
