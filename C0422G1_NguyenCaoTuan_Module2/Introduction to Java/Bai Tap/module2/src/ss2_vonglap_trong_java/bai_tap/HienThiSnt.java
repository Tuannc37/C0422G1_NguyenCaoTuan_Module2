package ss2_vonglap_trong_java.bai_tap;
import java.util.Scanner;

public class HienThiSnt {
    public static boolean kiemTraSnt(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        int n = scanner.nextInt();
        System.out.println(n + " so nguyên tố đầu tiên là : ");
        int dem = 0;
        int i = 2;
        while (dem < n) {
            if (kiemTraSnt(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
}
