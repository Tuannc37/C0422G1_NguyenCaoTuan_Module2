package ss11_collection_framework.bai_tap;

import java.util.Scanner;

public class Product implements Comparable<Product>{
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float gia1SP;

    public Product() {

    }

    public Product(String maHH, String tenHH, float soLuong, float gia1SP) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia1SP = gia1SP;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getGia1SP() {
        return gia1SP;
    }

    public void setGia1SP(float gia1SP) {
        this.gia1SP = gia1SP;
    }

    @Override
    public String toString() {
        return "maHH= " + maHH  + ", tenHH= " + tenHH + ", soLuong=" + soLuong + ", gia1SP=" + gia1SP;
    }
    public void display(){
        System.out.println(toString());
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã hàng hóa ");
        maHH = scanner.nextLine();

        System.out.println("Nhập vào tên hàng hóa");
        tenHH = scanner.nextLine();

        System.out.println("Nhập vào số lượng");
        soLuong = Float.parseFloat(scanner.nextLine());

        System.out.println("Nhập vào giá 1 sản phẩm");
        gia1SP = Float.parseFloat(scanner.nextLine());
    }

    @Override
    public int compareTo(Product o) {
        return 0;
    }
}

