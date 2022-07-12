package Hospital.HospitalController;

import Hospital.HospitalModel.People.FileHospital;
import Hospital.HospitalService.FileService;
import Mobile.Service.Implement.MobileService;

import java.util.Scanner;

public class MainMenu {
    private static FileService fileService = new FileService();
    public static void displayFileMenu() {

        System.out.println("=============Mobile Management==============");
        do {
            System.out.println("****Chọn chức năng hệ thống****" +
                    "\n 1.Thêm mới/Add new" +
                    "\n 2.Xóa/Delete" +
                    "\n 3.Xem danh sách/View list" +
                    "\n 4.Thoát/Exit ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("****Chọn chức năng theo số****");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    System.out.println("===========Thêm mới/Add new===========");
                    fileService.addNew();
                    break;
                case "2":
                    System.out.println("===========Xóa/Delete===========");
                    fileService.delete();
                    break;
                case "3":
                    System.out.println("===========Xem danh sách/View list===========");
                    fileService.display();
                    break;
                case "4":
                    System.out.println("Thoát");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nhâp từ 1 đến 4");

            }
        } while (true);
    }
}
