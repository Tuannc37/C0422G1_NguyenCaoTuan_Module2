package on_tap_huongdoituong.quanlycanbo;

import java.util.Scanner;

public class NhanVienPhucVu extends CanBo{
    String congViec;

    public NhanVienPhucVu() {
    }

    public NhanVienPhucVu(String fullname, String birthday, String gender, String address, String conViec) {
        super(fullname, birthday, gender, address);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Cong viec = " + congViec;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào công việc");
        congViec = scanner.nextLine();
    }
}
