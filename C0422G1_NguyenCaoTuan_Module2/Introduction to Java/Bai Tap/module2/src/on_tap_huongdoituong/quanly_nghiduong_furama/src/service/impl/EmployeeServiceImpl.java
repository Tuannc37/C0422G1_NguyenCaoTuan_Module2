package on_tap_huongdoituong.quanly_nghiduong_furama.src.service.impl;

import on_tap_huongdoituong.quanly_nghiduong_furama.src.models.Employee;
import on_tap_huongdoituong.quanly_nghiduong_furama.src.service.EmployeeService;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static final ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @Override
    public void add() {
        Employee employee = new Employee();
        System.out.println("Nhập họ tên");
        employee.setHoTen(scanner.nextLine());
        System.out.println("Nhập vào ngày sinh");
        employee.setNgaySinh(scanner.nextLine()) ;
        System.out.println("Nhập vào gioi tinh ");
        employee.setGioiTinh( scanner.nextLine());
        System.out.println("Nhập vào số chứng minh");
        employee.setSoChungMinh(Integer.parseInt(scanner.nextLine()));
        System.out.println("nhập vào số điện thoại");
        employee.setSoDienThoai(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhập vào email");
        employee.setEmail(scanner.nextLine());
        System.out.println("Nhập vào mã nhân viên");
        employee.setMaNhanVien(scanner.nextLine());
        System.out.println("Nhập vào trình độ");
        employee.setTrinhDo(scanner.nextLine());
        System.out.println("Nhập vào chức vụ");
        employee.setTrinhDo(scanner.nextLine());
        System.out.println("Nhập vào lương");
        employee.setLuong(Float.parseFloat(scanner.nextLine()));

        employeeArrayList.add(employee);
        display();
    }

    @Override
    public void edit() {
        System.out.println(" Chon sản phẩm cần sửa ");
        String edit = scanner.nextLine();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getHoTen().equalsIgnoreCase(edit)) {
                System.out.println("Nhập họ tên");
                employeeArrayList.get(i).setHoTen(scanner.nextLine());
                System.out.println("Nhập vào ngày sinh");
                employeeArrayList.get(i).setNgaySinh(scanner.nextLine()) ;
                System.out.println("Nhập vào gioi tinh ");
                employeeArrayList.get(i).setGioiTinh( scanner.nextLine());
                System.out.println("Nhập vào số chứng minh");
                employeeArrayList.get(i).setSoChungMinh(Integer.parseInt(scanner.nextLine()));
                System.out.println("nhập vào số điện thoại");
                employeeArrayList.get(i).setSoDienThoai(Integer.parseInt(scanner.nextLine()));
                System.out.println("Nhập vào email");
                employeeArrayList.get(i).setEmail(scanner.nextLine());
                System.out.println("Nhập vào mã nhân viên");
                employeeArrayList.get(i).setMaNhanVien(scanner.nextLine());
                System.out.println("Nhập vào trình độ");
                employeeArrayList.get(i).setTrinhDo(scanner.nextLine());
                System.out.println("Nhập vào chức vụ");
                employeeArrayList.get(i).setTrinhDo(scanner.nextLine());
                System.out.println("Nhập vào lương");
                employeeArrayList.get(i).setLuong(Float.parseFloat(scanner.nextLine()));
                break;
            }
        }
        display();
    }

    @Override
    public void delete() {
        System.out.println(" Nhập sản phẩm cần xoá");
        String delete = scanner.nextLine();
        for (int i = 0; i < employeeArrayList.size(); i++) {
            if (employeeArrayList.get(i).getHoTen().equalsIgnoreCase(delete)) {
                employeeArrayList.remove(i);
                break;
            }
        }
        display();
    }

    @Override
    public void display() {
        for (Object s : employeeArrayList) {
            System.out.println(s);
        }
    }
}
