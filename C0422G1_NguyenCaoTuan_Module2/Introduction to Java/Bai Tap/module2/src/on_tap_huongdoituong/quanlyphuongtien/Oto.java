package on_tap_huongdoituong.quanlyphuongtien;

import java.util.Scanner;

public class Oto extends PhuongTien {
    private int sochongoi;
    private float kieuxe;

    public Oto() {
    }

    public Oto(String bienso, String tenhangSX, String namSX, String chusohuu, int sochongoi) {
        super(bienso, tenhangSX, namSX, chusohuu);
        this.sochongoi = sochongoi;
    }

    public int getSochongoi() {
        return sochongoi;
    }

    public void setSochongoi(int sochongoi) {
        this.sochongoi = sochongoi;
    }

    public float getKieuxe() {
        return kieuxe;
    }

    public void setKieuxe(float kieuxe) {
        this.kieuxe = kieuxe;
    }

    @Override
    public String toString() {
        return super.toString() + "sochongoi=" + sochongoi + ", kieuxe=" + kieuxe;
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.print("Nhập vào số chỗ ngồi");
        sochongoi = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào kiểu xe");
        kieuxe = scanner.nextInt();

    }
}
