package ss17_string_regex.bai_tap.validate_tell;

import java.util.Scanner;

public class Tell {
    private static final String CHECK_TELL = "^(\\d{2}[-][0]\\d{9})$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            System.out.println("Nhập vào số điện thoại");
            String str = scanner.nextLine();
            check = str.matches(CHECK_TELL);
            if(check){
                System.out.println("Số điện thoại hợp lệ");
                break;
            }
            else System.out.println("Số điện thoại không hợp lệ.Vui lòng nhập lại!");
        }while(true);
    }
}
