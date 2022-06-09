package ss3_mang_phuongthuc_trong_java.thuc_hanh;
import java.util.Scanner;
public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số lượng phần tử mảng ");
            size = scanner.nextInt();
            if(size > 20) {
                System.out.println("Bạn đã nhập sai.Vui lòng nhập lại! ");
            }
        }while(size > 20);
        array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập vào arr[" + i + "] = ");
            array[i] = scanner.nextInt();
        }
        System.out.print("Mảng vừa nhập là ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.print("\nMảng sau khi đảo là ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

    }
}
