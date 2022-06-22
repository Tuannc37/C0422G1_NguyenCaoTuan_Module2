package on_tap_huongdoituong.baitap_mvc.controller;

import on_tap_huongdoituong.baitap_mvc.service.iplm.ProductService;
import java.util.Scanner;

public class MainProduct {
    private static ProductService productService = new ProductService();

    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Thêm " +
                    "\n 2.Sửa " +
                    "\n 3.Xoá " +
                    "\n 4.Hiển thị " +
                    "\n 5.Tìm tên " +
                    "\n 6.Sắp xếp sản phẩm tăng giảm " +
                    "\n 7.Thoát ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng thêm sản phẩm");
                    productService.add();
                    break;
                case 2:
                    System.out.println("Chức năng sửa thông tin sản phẩm theo ID");
                    productService.edit();
                    break;
                case 3:
                    System.out.println("Chức năng xoá sản phẩm theo ID");
                    productService.delete();
                    break;
                case 4:
                    System.out.println("Chức năng hiển thị danh sách sản phẩm");
                    productService.display();
                    break;
                case 5:
                    System.out.println("Chức năng tìm kiếm sản phẩm theo tên");
                    System.out.println(" Nhập tên cần tìm ");
                    String name = scanner.nextLine();
                    productService.searchByName(name);
                    break;
                case 6:
                    System.out.println("Chức năng sắp xếp sản phẩm tăng dần, giảm dần theo giá");
                    productService.sort();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
