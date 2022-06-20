package on_tap_huongdoituong.product;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số lượng phần tử");
        int n = Integer.parseInt(scanner.nextLine());

        Product[] products = new Product[n];
        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            products[i].input();
        }
        int indexMax = 0;
        for (int i = 0; i < n; i++) {
            if(products[i].getGia1SP() > products[indexMax].getGia1SP()){
                indexMax = i;
            }
        }
        products[indexMax].display();
    }
}
