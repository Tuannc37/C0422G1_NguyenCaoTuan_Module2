package on_tap_huongdoituong.baitap_mvc.service.iplm;

import on_tap_huongdoituong.baitap_mvc.model.Product;
import on_tap_huongdoituong.baitap_mvc.service.IService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ProductService implements IService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "bia", 15000));
        productArrayList.add(new Product(5, "coca", 12000));
        productArrayList.add(new Product(3, "pesi", 11000));
        productArrayList.add(new Product(8, "bánh", 100000));
        productArrayList.add(new Product(2, "kẹo", 50000));
    }

    @Override
    public void display() {
        for (Object s : productArrayList) {
            System.out.println(s);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập ID sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();

        System.out.println("Nhập giá sản phẩm");
        int cost = Integer.parseInt(scanner.nextLine());

        Product product = new Product(id, name, cost);
        // thêm mới dùng add()
        productArrayList.add(product);
        display();
    }

    @Override
    public void edit() {
        display();
        System.out.println(" Chon sản phẩm cần sửa ");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (edit == productArrayList.get(i).getId()) {
                System.out.println("Nhập ID sản phẩm");
                productArrayList.get(i).setId(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập tên sản phẩm");
                productArrayList.get(i).setName(scanner.nextLine());
                System.out.println("Nhập giá sản phẩm");
                productArrayList.get(i).setCost(Integer.parseInt(scanner.nextLine()));
                break;
            }
        }
        display();
    }

    @Override
    public void delete() {
        display();
        System.out.println(" Nhập sản phẩm cần xoá");
        int delete = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productArrayList.size(); i++) {
            if (delete == productArrayList.get(i).getId()) {
                productArrayList.remove(i);
                break;
            }
        }
        display();
    }

    @Override
    public void searchByName(String name) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (name.equals(productArrayList.get(i).getName())) {
                System.out.println(" tên cần tìm là " + productArrayList.get(i));
                break;
            }
        }
    }

    @Override
    public void sort() {
        display();
        System.out.println("-------------------------------------------");
        productArrayList.sort(Comparator.comparing(Product::getCost));
        display();
    }
}
