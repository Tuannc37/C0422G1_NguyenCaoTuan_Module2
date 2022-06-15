package ss7_abstract_class_interface.bai_tap.interface_colorable;

public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.floor(Math.random()*100));

        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle("blue", false, 3);
        shapes[1] = new Rectangle("red", true, 7, 8);
        shapes[2] = new Square("pink", true, 10);

        System.out.println("Before: ");
        for (Shape s : shapes){
            System.out.println(s.toString());
        }

        System.out.println("\nAfter: ");
        for (Shape s : shapes){
            s.resize(randomNumber);
            System.out.println(s.toString());
        }
    }
}
