package on_tap_huongdoituong.quanly_nghiduong_furama.src.models;

public class Person {
    private String hoTen;
    private String ngaySinh;
    private String gioiTinh;
    private int soChungMinh;
    private int soDienThoai;
    private String email;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String gioiTinh, int soChungMinh, int soDienThoai, String email) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.soChungMinh = soChungMinh;
        this.soDienThoai = soDienThoai;
        this.email = email;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getSoChungMinh() {
        return soChungMinh;
    }

    public void setSoChungMinh(int soChungMinh) {
        this.soChungMinh = soChungMinh;
    }

    public int getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(int soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return  "Họ tên ='" + hoTen + '\'' +
                ", Ngày sinh ='" + ngaySinh + '\'' +
                ", Giới tính ='" + gioiTinh + '\'' +
                ", Số chứng minh =" + soChungMinh +
                ", Số điện thoại =" + soDienThoai +
                ", Email ='" + email;
    }
}
