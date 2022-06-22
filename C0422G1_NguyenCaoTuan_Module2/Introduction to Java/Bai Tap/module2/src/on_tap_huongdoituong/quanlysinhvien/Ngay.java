package on_tap_huongdoituong.quanlysinhvien;

import java.util.Objects;
import java.util.Scanner;

public class Ngay {
    private int ngay,thang,nam;

    public Ngay() {
    }

    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "Sinh ngay=" + ngay + "- thang=" + thang + "- nam=" + nam;
    }
    public void display(){
        System.out.println(toString());
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào ngày");
        ngay = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào tháng");
        thang = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào năm");
        nam = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ngay ngay1 = (Ngay) o;
        return ngay == ngay1.ngay && thang == ngay1.thang && nam == ngay1.nam;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ngay, thang, nam);
    }
}
