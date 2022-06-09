package ss3_mang_phuongthuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử trong mảng ");
        int size = scanner.nextInt();
        int[] array = new int[size];

        nhapMang(array);

        System.out.print("Mảng vừa nhập vào là ");
        xuatMang(array);

        System.out.print("\nNhập vào số cần tìm ");
        int number = scanner.nextInt();

        xoaPhanTuMang(array,number);

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
    public static void xoaPhanTuMang(int[] array ,int n) {
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == n){
                flag = true;
                for(int j = i;j < array.length - 1;j++){
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
            else flag = false;
        }
        if(flag == false){
            System.out.println("Số vừa nhập không có trong mảng");
        }

    }
}
