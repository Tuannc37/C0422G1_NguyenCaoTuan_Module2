package on_tap_huongdoituong.quanlycanbo;

import java.util.Scanner;

public class KiSu extends CanBo{
    String nganh;

    public KiSu() {
    }

    public KiSu(String fullname, String birthday, String gender, String address, String nganh) {
        super(fullname, birthday, gender, address);
        this.nganh = nganh;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return super.toString() + " ,nganh = " + nganh;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập vào ngành học ");
        nganh = scanner.nextLine();
    }
}
