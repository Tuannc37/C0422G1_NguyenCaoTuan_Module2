package Mobile.Controller;

import Mobile.Service.Implement.MobileService;

import java.util.Scanner;

public class MobileControl {
    private static MobileService mobileService = new MobileService();
    public static void displayMobileMenu() {

        System.out.println("=============Mobile Management==============");
        do {
            System.out.println("****Chọn chức năng hệ thống****" +
                    "\n 1.Thêm mới/Add new" +
                    "\n 2.Xóa/Delete" +
                    "\n 3.Xem danh sách/View list" +
                    "\n 4.Tìm kiếm/Finding" +
                    "\n 5.Thoát/Exit ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("****Chọn chức năng theo số****");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("===========Thêm mới/Add new===========");
                    mobileService.add();
                    break;
                case "2":
                    System.out.println("===========Xóa/Delete===========");
                    mobileService.delete();
                    break;
                case "3":
                    System.out.println("===========Xem danh sách/View list===========");
                    mobileService.display();
                    break;
                case "4":
                    System.out.println("===========Tìm kiếm/Finding===========");
                    mobileService.find();
                    break;
                case "5":
                    System.out.println("===========Ưu đãi===========");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhâp từ 1 đến 5");

            }
        } while (true);
    }
}

