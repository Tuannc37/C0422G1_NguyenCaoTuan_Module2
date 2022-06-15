package ss7_abstract_class_interface.bai_tap.interface_resizeable;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", false, 3);
        shapes[1] = new Rectangle("red", true, 7, 8);
        shapes[2] = new Square("pink", true, 10);

        for (Shape s : shapes) {
            System.out.println(s.toString());
            if (s instanceof Colorable) {
                s.howToColor();
            }
        }
    }
}
