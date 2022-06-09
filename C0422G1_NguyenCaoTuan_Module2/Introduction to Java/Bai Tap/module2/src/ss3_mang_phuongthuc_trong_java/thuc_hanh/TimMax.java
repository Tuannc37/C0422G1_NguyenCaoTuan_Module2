package ss3_mang_phuongthuc_trong_java.thuc_hanh;
import java.util.Scanner;

public class TimMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử mảng ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        for(int i = 0;i < array.length;i++){
            System.out.print("Nhập vào a[" + i +"] = ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mảng bạn vừa nhập là ");
        for(int i = 0;i < array.length;i++){
           System.out.print(array[i] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("\nGiá trị lớn nhất trong mảng là : " + max + "\nNằm ở vị trí " + index);
    }
}
