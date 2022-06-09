package ss3_mang_phuongthuc_trong_java.bai_tap;
import java.util.Scanner;

public class SoLanXuatHienKiTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi : ");

        String str = scanner.nextLine();
        System.out.println("Nhập vào kí tự cần tìm ");

        char c = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(c == str.charAt(i)){
                count ++;
            }
        }
        System.out.println("Số lần xuất hiện kí tự " + str + "trong chuỗi là " + count);
    }

}
