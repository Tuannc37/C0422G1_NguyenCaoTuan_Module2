package ss17_string_regex.bai_tap.validate_nameclass;

import java.util.Scanner;

public class NameClass {
    private static final String  CHECK_NAME_CLASS = "^([CAP]\\d{4}[GHIKLM])$";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            System.out.println("Nhập vào tên lớp học");
            String str = scanner.nextLine();
            check = str.matches(CHECK_NAME_CLASS);
            if(check){
                System.out.println("Tên lớp học hợp lệ");
                break;
            }
            else System.out.println("Tên lớp học không hợp lệ.Vui lòng nhập lại!");
        }while(true);
    }
}
