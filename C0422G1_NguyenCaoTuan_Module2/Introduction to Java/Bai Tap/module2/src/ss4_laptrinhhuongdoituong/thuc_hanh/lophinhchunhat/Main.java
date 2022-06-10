package ss4_laptrinhhuongdoituong.thuc_hanh.lophinhchunhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài ");
        double width = scanner.nextDouble();

        System.out.println("Nhập vào chiều rộng ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width,height);
        System.out.print("Diện tích hình chữ nhật là : " + rectangle.getArea());
        System.out.print("\nChu vi hình vuông là : " + rectangle.getPerimeter());
    }
}
