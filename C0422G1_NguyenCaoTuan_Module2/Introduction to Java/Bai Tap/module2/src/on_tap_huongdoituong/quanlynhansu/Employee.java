package on_tap_huongdoituong.quanlynhansu;

import java.util.Scanner;

public class Employee {
    String fullname;
    String gender;
    String address;
    String position;
    float salary;

    public Employee() {
    }

    public Employee(String fullname, String gender, String address, String position, float salary) {
        this.fullname = fullname;
        this.gender = gender;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullname='" + fullname + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên");
        fullname = scanner.nextLine();
        System.out.println("Nhập vào giới tính");
        gender = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ");
        address = scanner.nextLine();
        System.out.println("Nhập vào chức vụ");
        position = scanner.nextLine();
        System.out.println("Nhập vào lương");
        salary = Float.parseFloat(scanner.nextLine());
    }
}
