package on_tap_huongdoituong.quanly_nghiduong_furama.src.models;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private float dienTichHoBoi;
    private int soTang;

    public Villa() {
    }

    public Villa(String tenDichVu, float dienTichSuDung, float chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong, float dienTichHoBoi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public float getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(float dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return  super.toString() + '\'' +
                ", Tiêu chuẩn phòng='" + tieuChuanPhong + '\'' +
                ", Diện tích hồ bơi=" + dienTichHoBoi +
                ", Số tầng=" + soTang;
    }
}
