package ss3_mang_phuongthuc_trong_java.thuc_hanh;
import com.sun.javafx.geom.CubicApproximator;

import java.util.Scanner;

public class TimMin {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        nhapMang(array);
        System.out.println("Mảng bạn vừa nhập là ");
        xuatMang(array);
        timMin(array);

    }
    public static void nhapMang(int[] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào a[" + i +"] = ");
            array[i] = scanner.nextInt();
        }
    }
    public static void xuatMang(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
    public static void timMin(int[] array) {
        int min = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
                index = i + 1;
            }
        }
        System.out.println("\nGiá trị bé nhất trong mảng là : " + min + "\nNằm ở vị trí " + index);
    }
}
