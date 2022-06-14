package ss6_ke_thua.bai_tap.circle_cylinder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3,"red");
        System.out.print("Thông tin Circle" + circle + "\nArea : " + circle.getArea());

        Cylinder cylinder = new Cylinder(3,"black",10);
        System.out.print("\n\nThông tin Circle" + cylinder);

    }

}
