package ss11_collection_framework.bai_tap;


import java.util.*;
import java.util.Collections;

public class ProductManager {
    static List<Product> productList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choose;
        do {
            showMenu();
            System.out.println("Nhập vào lựa chọn");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    themSanPham();
                    break;

                case 2:
                    suaSanPham();
                    break;

                case 3:
                   xoaSanPham();
                    break;

                case 4:
                    timKiemSanPham();
                    break;

                case 5:
                    sapXepSanPham();
                    break;

                case 6:
                    hienThiSanPham();
                    break;

                case 7:
                    System.out.println("Thoat!");
                    break;

                default:
                    System.out.println("Bạn đã nhập sai.Vui lòng nhập lại");
                    break;
            }

        }while(choose != 7);
    }
    public static void showMenu(){
        System.out.println("------MENU--------");
        System.out.println("1.Thêm Sản phẩm");
        System.out.println("2.Sửa sản phẩm");
        System.out.println("3.Xóa sản phẩm");
        System.out.println("4.Tìm kiếm sản phẩm");
        System.out.println("5.Sắp xếp sản phẩm");
        System.out.println("6.Hiển thị sản phẩm");
        System.out.println("7.Thoát");
        System.out.println("------------------");
    }

    public static void themSanPham(){
        System.out.println("Nhập số sản phẩm cần thêm");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            Product product = new Product();
            product.input();
            productList.add(product);
        }
    }

    public static void suaSanPham(){
        System.out.println("Nhập vào mã hàng hóa cần tìm");
        String maHH = scanner.nextLine();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getMaHH().equalsIgnoreCase(maHH)) {
                System.out.println("Nhập vào mã hàng hóa cần sửa");
                productList.get(i).setMaHH(scanner.nextLine());
                System.out.println("Nhập vào tên hàng hóa cần sửa");
                productList.get(i).setTenHH(scanner.nextLine());
                System.out.println("Nhập vào số lượng hàng hóa cần sửa");
                productList.get(i).setSoLuong(Float.parseFloat(scanner.nextLine()));
                System.out.println("Nhập vào giá hàng hóa cần sửa");
                productList.get(i).setGia1SP(Float.parseFloat(scanner.nextLine()));
                return;
            }
        }
        System.out.println("Mã sản phẩm bạn nhập không có trong danh sách!");
    }

    public static void xoaSanPham(){
        System.out.println("Nhập vào mã hàng hóa cần tìm");
        String maHH = scanner.nextLine();

        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getMaHH().equalsIgnoreCase(maHH)) {
                productList.remove(productList.get(i));
                System.out.println("Bạn đã xoá thành công");
                return;
            }
        }
        System.out.println("Mã sản phẩm bạn nhập không có trong danh sách!");
    }


    public static void timKiemSanPham(){
        System.out.println("Nhập vào mã hàng hóa cần tìm kiếm");
        String maHH = scanner.nextLine();
        for(Product product:productList){
            if(product.getMaHH().equalsIgnoreCase(maHH)){
                product.display();
            }
        }
    }

    public static void sapXepSanPham(){
        Collections.sort(productList);
        hienThiSanPham();
    }

    public static void hienThiSanPham(){
        for(Product product:productList) product.display();
    }

}
