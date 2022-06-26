package on_tap_huongdoituong.quanly_nghiduong_furama.src.models;

public class Employee extends Person {
    private String maNhanVien;
    private String trinhDo;
    private String chucVu;
    private float luong;

    public Employee() {
    }

    public Employee(String hoTen, String ngaySinh, String gioiTinh, int soChungMinh, int soDienThoai, String email, String maNhanVien, String trinhDo, String chucVu, float luong) {
        super(hoTen, ngaySinh, gioiTinh, soChungMinh, soDienThoai, email);
        this.maNhanVien = maNhanVien;
        this.trinhDo = trinhDo;
        this.chucVu = chucVu;
        this.luong = luong;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public void setTrinhDo(String trinhDo) {
        this.trinhDo = trinhDo;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Mã nhân viên='" + maNhanVien + '\'' +
                ", Trình độ='" + trinhDo + '\'' +
                ", Chức vụ='" + chucVu + '\'' +
                ", Lương=" + luong;
    }
}
