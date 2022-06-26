package on_tap_huongdoituong.quanly_nghiduong_furama.src.models;

public class Facility {
    private String tenDichVu;
    private float dienTichSuDung;
    public float chiPhiThue;
    private int soLuongNguoi;
    private String kieuThue;

    public Facility() {
    }

    public Facility(String tenDichVu, float dienTichSuDung, float chiPhiThue, int soLuongNguoi, String kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoi = soLuongNguoi;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public float getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(float dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public float getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(float chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoi() {
        return soLuongNguoi;
    }

    public void setSoLuongNguoi(int soLuongNguoi) {
        this.soLuongNguoi = soLuongNguoi;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Tên Dịch Vụ = '" + tenDichVu + '\'' +
                ", Diện Tích Sử Dụng = " + dienTichSuDung +
                ", Chi Phí Thuê = " + chiPhiThue +
                ", Số Lượng Người = " + soLuongNguoi +
                ", Kiểu Thuê ='" + kieuThue;
    }
}
