package on_tap_huongdoituong.quanly_nghiduong_furama.src.models;

public class House extends Facility {
    private String tieuChuanPhong;
    private int soTang;

    public House() {
    }

    public House(String tenDichVu, float dienTichSuDung, float chiPhiThue, int soLuongNguoi, String kieuThue, String tieuChuanPhong,int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
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
                ", Số tầng=" + soTang +
                '}';
    }
}
