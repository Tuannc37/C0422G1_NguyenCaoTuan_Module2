package Hospital.HospitalUliti;

import java.util.Scanner;

public class VipType {
    public static String vipType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Loại VIP****\n" +
                "1. VIP I \n" +
                "2. VIP II \n" +
                "3. VIP III");
        System.out.println("Chọn loại");
        String choose = scanner.nextLine();
        do {
            switch (choose) {
                case "1":
                    return "VIP I";
                case "2":
                    return "VIP II";
                case "3":
                    return "VIP III";
                default:
                    return "Chỉ nhập 1 - 3";
            }
        } while (true);
    }
}
