package ss16_binaryfile_serialization.bai_tap.baitap_mvc.bai1.service.iplm;

import on_tap_huongdoituong.baitap_mvc.model.Product;
import ss16_binaryfile_serialization.bai_tap.baitap_mvc.bai1.service.IService;
import ss16_binaryfile_serialization.bai_tap.baitap_mvc.bai1.utils.ReadAndWrite;

import java.util.List;
import java.util.Scanner;

public class ProductService implements IService {
    private final String PATH_FILE_PRODUCT = "ss16_binaryfile_serialization/bai_tap/baitap_mvc/bai1/data/product.csv";
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void add() {
        List<Product> products = ReadAndWrite.read(PATH_FILE_PRODUCT);
        System.out.print("Nhập mã sản phẩm: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String manufacturer = scanner.nextLine();
        int price;
        while (true) {
            try {
                System.out.print("Nhập giá sản phẩm: ");
                price = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số!");
            }
        }
        products.add(new Product(id, name, manufacturer, price));
        System.out.println("Bạn đã thêm sản phẩm: " + name);
        ReadAndWrite.write(PATH_FILE_PRODUCT, products);
    }


    @Override
    public void display() {
        List<Product> products = ReadAndWrite.read(PATH_FILE_PRODUCT);
        for (Product product : products) {
            System.out.println(product);
        }
    }

    @Override
    public void findProductById(int id) {
        List<Product> products = ReadAndWrite.read(PATH_FILE_PRODUCT);
        for (int i = 0; i < products.size(); i++) {
            if(products.get(i).getId() == id) {
                System.out.println("Đã tìm thấy thông tin");
                System.out.println(products.get(i));
                return;
            }
        }
        System.out.println("Mã sản phẩm bạn muốn tìm không tồn tại!");
    }

}
