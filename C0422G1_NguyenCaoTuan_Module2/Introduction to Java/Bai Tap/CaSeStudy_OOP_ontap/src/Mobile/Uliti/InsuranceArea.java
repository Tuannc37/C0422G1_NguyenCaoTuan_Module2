package Mobile.Uliti;

import java.util.Scanner;

public class InsuranceArea {
    public static String area() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Khu vực bảo hành****\n" +
                "1. Quốc tê \n" +
                "2. Toàn Quốc");
        System.out.println("Chọn khu vực");
        int choose = Integer.parseInt(scanner.nextLine());
        do {
            switch (choose) {
                case 1:
                    return "Quốc tế";
                case 2:
                    return "Toàn quốc";

                default:
                    return "Chỉ nhập 1 - 3";
            }
        } while (true);
    }
}
