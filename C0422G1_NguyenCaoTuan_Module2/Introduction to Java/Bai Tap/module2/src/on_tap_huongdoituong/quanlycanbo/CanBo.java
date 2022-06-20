package on_tap_huongdoituong.quanlycanbo;

import java.util.Scanner;

public class CanBo {
    String fullname,birthday,gender,address;

    public CanBo() {
    }

    public CanBo(String fullname, String birthday, String gender, String address) {
        this.fullname = fullname;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "fullname= " + fullname + ", birthday= " + birthday +", gender= " + gender + ", address= " + address;
    }
    public void display(){
        System.out.println(this);
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập họ tên ");
        fullname = scanner.nextLine();

        System.out.println("Nhập vào ngày sinh");
        birthday = scanner.nextLine();

        System.out.println("Nhập vào giới tính");
        gender = scanner.nextLine();

        System.out.println("Nhập vào địa chỉ");
        address = scanner.nextLine();

    }
}
