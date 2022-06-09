package ss3_mang_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        nhapMang(array);

        System.out.print("Mảng vừa nhập vào là ");
        xuatMang(array);

        System.out.print("\nNhập vào số cần thêm ");
        int number = scanner.nextInt();

        System.out.print("\nNhập vào vị trí cần thêm ");
        int viTri = scanner.nextInt();
        themPhanTuVaoMang(array,number,viTri);

        System.out.println("Mảng sau khi xóa là : ");
        xuatMang(array);

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
    public static void themPhanTuVaoMang(int[] array,int n,int viTri) {
        for (int i = 0; i < array.length; i++) {
            if(i == viTri){
                array[i] = n;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
    }
}
