package ss2_vonglap_trong_java.bai_tap;
import java.util.Scanner;

public class SoNguyenTo {
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
        System.out.println("Những số nguyên tố bé thua 100 là :");
        for(int i = 0;i < 100;i++){
            if(kiemTraSnt(i)){
                System.out.println(i + " ");
            }
        }
    }
}
