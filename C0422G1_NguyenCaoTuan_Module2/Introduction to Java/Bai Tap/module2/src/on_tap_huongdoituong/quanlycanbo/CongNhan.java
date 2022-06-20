package on_tap_huongdoituong.quanlycanbo;

import java.util.Scanner;

public class CongNhan extends CanBo{
    public static final int BAC_MAX = 7;
    int bac;

    public CongNhan() {
    }

    public CongNhan(String fullname, String birthday, String gender, String address, int bac) {
        super(fullname, birthday, gender, address);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + " ,bac = " + bac;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cấp bậc nhan vien");
        bac = Integer.parseInt(scanner.nextLine());
    }
}
