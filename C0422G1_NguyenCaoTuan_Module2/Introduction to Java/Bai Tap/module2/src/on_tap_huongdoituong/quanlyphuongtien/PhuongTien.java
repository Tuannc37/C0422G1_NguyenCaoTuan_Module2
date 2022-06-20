package on_tap_huongdoituong.quanlyphuongtien;

import java.util.Scanner;

public class PhuongTien {
    private String bienso;
    private  String tenhangSX;
    private String namSX;
    private  String chusohuu;

    public PhuongTien() {
    }

    public PhuongTien(String bienso, String tenhangSX, String namSX, String chusohuu) {
        this.bienso = bienso;
        this.tenhangSX = tenhangSX;
        this.namSX = namSX;
        this.chusohuu = chusohuu;
    }

    public String getBienso() {
        return bienso;
    }

    public void setBienso(String bienso) {
        this.bienso = bienso;
    }

    public String getTenhangSX() {
        return tenhangSX;
    }

    public void setTenhangSX(String tenhangSX) {
        this.tenhangSX = tenhangSX;
    }

    public String getNamSX() {
        return namSX;
    }

    public void setNamSX(String namSX) {
        this.namSX = namSX;
    }

    public String getChusohuu() {
        return chusohuu;
    }

    public void setChusohuu(String chusohuu) {
        this.chusohuu = chusohuu;
    }

    @Override
    public String toString() {
        return  "bienso='" + bienso + '\'' +
                ", tenhangSX='" + tenhangSX + '\'' +
                ", namSX='" + namSX + '\'' +
                ", chusohuu='" + chusohuu;
    }

    public void display(){
        System.out.println(toString());
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào biển số xe");
        bienso = scanner.nextLine();
        System.out.print("Nhập vào tên hãng sản xuất");
        tenhangSX = scanner.nextLine();
        System.out.print("Nhập vào năm sản xuất");
        namSX = scanner.nextLine();
        System.out.print("Nhập vào chủ sở hữu");
        chusohuu  = scanner.nextLine();
    }
}
