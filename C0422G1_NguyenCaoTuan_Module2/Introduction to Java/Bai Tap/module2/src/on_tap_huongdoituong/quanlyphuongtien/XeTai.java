package on_tap_huongdoituong.quanlyphuongtien;

import java.util.Scanner;

public class XeTai extends PhuongTien {
    private float trongtai;

    public XeTai() {
    }

    public XeTai(String bienso, String tenhangSX, String namSX, String chusohuu, float trongtai) {
        super(bienso, tenhangSX, namSX, chusohuu);
        this.trongtai = trongtai;
    }

    public float getTrongtai() {
        return trongtai;
    }

    public void setTrongtai(float trongtai) {
        this.trongtai = trongtai;
    }

    @Override
    public String toString() {
        return super.toString() + "trongtai=" + trongtai;
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhập vào trọng tải của xe");
        trongtai = Float.parseFloat(scanner.nextLine());
    }
}
