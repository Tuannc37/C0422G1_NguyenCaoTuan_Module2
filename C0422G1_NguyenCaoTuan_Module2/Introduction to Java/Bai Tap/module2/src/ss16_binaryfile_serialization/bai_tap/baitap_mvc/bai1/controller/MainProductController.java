package ss16_binaryfile_serialization.bai_tap.baitap_mvc.bai1.controller;

import ss16_binaryfile_serialization.bai_tap.baitap_mvc.bai1.service.iplm.ProductService;

import java.util.Scanner;

public class MainProductController {
    static ProductService productService = new ProductService();
    public static void displayMainMenu() {

        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Thêm " +
                    "\n 2.Hiển thị " +
                    "\n 3.Tìm sản phẩm " +
                    "\n 4.Thoát ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Chức năng thêm sản phẩm");
                    productService.add();
                    break;
                case 2:
                    System.out.println("Chức năng hiển thị danh sách sản phẩm");
                    productService.display();
                    break;
                case 3:
                    System.out.println("Chức năng tìm kiếm sản phẩm theo id");
                    System.out.println("Nhập id cần tìm ");
                    int id = Integer.parseInt(scanner.nextLine());
                    productService.findProductById(id);
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
