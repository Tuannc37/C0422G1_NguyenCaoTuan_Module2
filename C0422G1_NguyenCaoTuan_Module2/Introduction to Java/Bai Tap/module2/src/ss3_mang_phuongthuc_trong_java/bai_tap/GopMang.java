package ss3_mang_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;
import java.util.Arrays;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng 1 ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        nhapMang(array1);
        System.out.print("Mảng thứ nhất là ");
        xuatMang(array1);

        System.out.println("\nNhập vào số lượng phần tử trong mảng 2 ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        nhapMang(array2);
        System.out.print("Mảng thứ 2 là ");
        xuatMang(array2);

        System.out.print("\nMảng sau khi gộp là ");
        gopMang(array1,array2);


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

    public static void gopMang(int[] array1, int[] array2) {
        int size3 = array1.length + array2.length;
        int[] array3 = new int[size3];
        int pos = 0;
        for (int element : array1) {
            array3[pos] = element;
            pos++;
        }
        for (int element : array2) {
            array3[pos] = element;
            pos++;
        }
        System.out.println(Arrays.toString(array3));
    }
}
