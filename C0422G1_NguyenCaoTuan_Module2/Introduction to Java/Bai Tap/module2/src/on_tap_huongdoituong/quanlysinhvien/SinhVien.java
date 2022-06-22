package on_tap_huongdoituong.quanlysinhvien;


import java.util.Scanner;

public class SinhVien {
    private String maSinhVien,hoVaTen;
    private Ngay ngaySinh;
    private double diemTrungBinh;
    private Lop lop;

    public SinhVien() {
    }

    public SinhVien(String maSinhVien, String hoVaTen, Ngay ngaySinh, double diemTrungBinh, Lop lop) {
        this.maSinhVien = maSinhVien;
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.diemTrungBinh = diemTrungBinh;
        this.lop = lop;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Ngay getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Ngay ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public Lop getLop() {
        return lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }
    public String layTenKhoa(){
        return this.lop.getTenKhoa();
    }
    public boolean kiemTraThiDat(){
        return this.diemTrungBinh >= 5;
    }
    public boolean kiemTraCungNgaySinh(SinhVien svKhac){
        return this.getNgaySinh().equals(svKhac.getNgaySinh());
    }

    @Override
    public String toString() {
        return "maSinhVien= " + maSinhVien + ", hoVaTen= " + hoVaTen + ", ngaySinh=" + ngaySinh + ", diemTrungBinh=" + diemTrungBinh + ", lop=" + lop;
    }

    public void display(){
        System.out.println(toString());
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sinh viên");
        maSinhVien = scanner.nextLine();
        System.out.println("nhập vào họ tên");
        hoVaTen = scanner.nextLine();
       
    }
}

