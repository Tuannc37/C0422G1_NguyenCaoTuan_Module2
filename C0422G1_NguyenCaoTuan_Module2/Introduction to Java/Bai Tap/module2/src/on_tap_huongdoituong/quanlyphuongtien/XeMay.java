package on_tap_huongdoituong.quanlyphuongtien;

import java.util.Scanner;

public class XeMay extends PhuongTien {
    private double congsuat;

    public XeMay() {
    }

    public XeMay(String bienso, String tenhangSX, String namSX, String chusohuu, double congsuat) {
        super(bienso, tenhangSX, namSX, chusohuu);
        this.congsuat = congsuat;
    }

    public double getCongsuat() {
        return congsuat;
    }

    public void setCongsuat(double congsuat) {
        this.congsuat = congsuat;
    }

    @Override
    public String toString() {
        return super.toString() + "congsuat=" + congsuat;
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào công suất xe");
        congsuat = Double.parseDouble(scanner.nextLine());
    }
}
