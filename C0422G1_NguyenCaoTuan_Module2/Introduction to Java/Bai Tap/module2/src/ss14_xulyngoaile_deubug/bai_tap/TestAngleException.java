package ss14_xulyngoaile_deubug.bai_tap;

import java.util.Scanner;

public class TestAngleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Angle angle = new Angle();
        do{
            try {
                System.out.print("Nhập cạnh a: ");
                int a = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập cạnh b: ");
                int b = Integer.parseInt(scanner.nextLine());
                System.out.print("Nhập cạnh c: ");
                int c = Integer.parseInt(scanner.nextLine());
                angle = new Angle(a,b,c);
                flag = false;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
                System.out.println("Nhập lại các cạnh của tam giác");
                flag = true;
            } catch (NumberFormatException e) {
                System.err.println("Bạn nhập không phải số!");
                System.out.println("Nhập lại Các cạnh của tam giác");
                flag = true;
            }
        }while(flag);
    }
}
