package ss3_mang_phuongthuc_trong_java.bai_tap;

import java.util.Scanner;

public class TinhTongCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrays = {
                {1, 3, 4, 5},
                {6, 4, 12, 8},
                {2, 6, 1, -4}
        };

        int column = 0;
        do {
            System.out.print("Nhập số cột bạn muốn tính tổng: ");
            column = Integer.parseInt(scanner.nextLine());
            if (column >= arrays[0].length) {
                System.out.println("Cột bạn nhập không tồn tại");
            }
        } while (column >= arrays[0].length);

        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i][column];
        }
        System.out.println("Tổng của cột " + column + " là: " + sum);
    }
}
