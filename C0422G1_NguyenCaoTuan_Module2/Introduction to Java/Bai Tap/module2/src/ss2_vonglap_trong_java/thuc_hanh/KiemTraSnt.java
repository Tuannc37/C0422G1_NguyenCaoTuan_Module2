package ss2_vonglap_trong_java.thuc_hanh;
import java.util.Scanner;

public class KiemTraSnt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số n :");
        int n = scanner.nextInt();
        boolean check = true;
        if (n < 2) {
            check = false;
        }
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println(n + " là số nguyên tố");
        } else {
            System.out.println(n + " không phải là số nguyên tố");
        }
    }
}
