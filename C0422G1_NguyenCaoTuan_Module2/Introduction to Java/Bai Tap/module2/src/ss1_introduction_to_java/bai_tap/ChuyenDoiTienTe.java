package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {

    public static void main(String[] args) {
        System.out.println("Nhập vào số tiền cần đổi ");
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        int vnd = usd * 23000;
        System.out.printf("Số tiền quy ra VND là : %d  VND",vnd);
    }
}