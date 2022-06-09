package ss3_mang_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;

public class TimMaxMangHaiChieu {
    public static void main(String[] args) {
        int soDong, soCot;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số dòng của mảng: ");
        soDong = scanner.nextInt();
        System.out.println("Nhập vào số cột của mảng: ");
        soCot = scanner.nextInt();

        int[][] A = new int[soDong][soCot];
        nhapMang(A,soDong,soCot);
        System.out.println("Mảng bạn vừa nhập là");
        xuatMang(A,soDong,soCot);
        System.out.println("Phần tử lớn nhất trong mảng là : " +timMax(A,soDong,soCot));

    }
    public static void nhapMang(int[][] array,int soDong,int soCot){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void xuatMang(int[][] array,int soDong,int soCot){
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }

    public static int timMax(int[][] array,int soDong,int soCot){
        int max = array[0][0];
        for (int i = 0; i < soDong; i++) {
            for (int j = 0; j < soCot; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
