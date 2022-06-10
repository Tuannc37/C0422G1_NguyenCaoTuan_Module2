package ss4_laptrinhhuongdoituong.bai_tap.quadraticequation;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào a : ");
        double a = input.nextDouble();

        System.out.print("Nhập vào b : ");
        double b = input.nextDouble();

        System.out.print("Nhập vào c : ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        double x = quadraticEquation.getDiscriminant();
        System.out.print("Delta = " + x);
        if(x > 0){
            System.out.println("\nPhương trình có 2 nghiệm phân biệt");
            System.out.print("x1 = " + quadraticEquation.getRoot1());
            System.out.print("\nx2 = " + quadraticEquation.getRoot2());
        }
        else if(x == 0){
            System.out.println("x1 = x2 = " + quadraticEquation.getRoot1());
        }
        else System.out.print("The equation has no roots");

    }
}
