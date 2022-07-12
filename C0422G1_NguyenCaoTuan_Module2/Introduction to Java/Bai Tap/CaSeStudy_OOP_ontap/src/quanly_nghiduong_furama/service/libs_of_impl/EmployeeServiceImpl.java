package on_tap_huongdoituong.quanly_nghiduong_furama.service.libs_of_impl;


import on_tap_huongdoituong.quanly_nghiduong_furama.models.person.Employee;
import on_tap_huongdoituong.quanly_nghiduong_furama.service.libs_of_interface.EmployeeService;
import on_tap_huongdoituong.quanly_nghiduong_furama.util.ReadAndWriteFurama;
import on_tap_huongdoituong.quanly_nghiduong_furama.util.regex.RegexPerson;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl extends ServiceAbstract implements EmployeeService {
    private static final String EMPLOYEE_LIST = "src\\data\\employee.csv";
    Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employeeList = new ArrayList<>();

    private List<Employee> getEmployeeList() {
        List<Employee> listFileEmployee = new ArrayList<>();
        List<String[]> listStr = ReadAndWriteFurama.readList(EMPLOYEE_LIST);
        for (String[] element : listStr) {
            Employee employee = new Employee(Integer.parseInt(element[0]),
                    element[1],
                    element[2],
                    element[3],
                    element[4],
                    Integer.parseInt(element[5]),
                    Integer.parseInt(element[6]),
                    element[7],
                    element[8],
                    element[9],
                    Double.parseDouble(element[10]));
            listFileEmployee.add(employee);
        }
        return listFileEmployee;
    }

    @Override
    public void display() throws IOException {
        for (Employee employee:employeeList) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNew() throws IOException {
        int id = inputIDEmployee(employeeList);
        System.out.println("Nhập tên nhân viên:");
        String name = sc.nextLine();
        String dateOfBirth = RegexPerson.getDateOfBirth();
        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();
        System.out.println("Chọn giới tính:");
        String gender = sc.nextLine();
        System.out.println("Nhập số CMND:");
        int idCard = RegexPerson.inputIntNumber();
        System.out.println("Nhập số điện thoại:");
        int phoneNumber = RegexPerson.inputIntNumber();
        String email = RegexPerson.inputEmail();
        System.out.println("Chọn trình độ:");
        String level = chooseLevel();
        System.out.println("Chọn vị trí:");
        String position = choosePosition();
        System.out.println("Nhập lương:");
        double salary = RegexPerson.inputDouNumber();

        Employee employee = new Employee(id, name, dateOfBirth, address, gender, idCard, phoneNumber, email, level, position, salary);
        employeeList.add(employee);
        String line = id + "," +
                name + "," +
                dateOfBirth + "," +
                address + "," +
                gender + "," +
                idCard + "," +
                phoneNumber + "," +
                email + "," +
                level + "," +
                position + "," +
                salary;
        ReadAndWriteFurama.writeList(EMPLOYEE_LIST, line);
        System.out.println("Thêm mới thành công");
    }

    public static int inputIDEmployee(ArrayList<Employee> listEmployee){
        System.out.println("Nhập ID nhân viên:");
        int id;
        int count;
        while (true){
            count = 0;
            id = RegexPerson.inputIntNumber();
            for (Employee employee : listEmployee) {
                if (id == employee.getId()){
                    System.out.println("Trùng ID, mời nhập lại:");
                    count++;
                    break;
                }
            }
            if (count == 0){
                return id;
            }
        }
    }

    public String chooseLevel() {
        while (true) {
            try {
                System.out.println("1.Trung cấp");
                System.out.println("2.Cao đẳng");
                System.out.println("3.Đại học");
                System.out.println("4.Sau đại học");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        return "Trung cấp";
                    case 2:
                        return "Cao đẳng";
                    case 3:
                        return "Đại học";
                    case 4:
                        return "Sau đại học";
                    default:
                        System.out.println("Thử lại");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
    }

    public String choosePosition() {
        while (true) {
            try {
                System.out.println("1.Lễ tân");
                System.out.println("2.Phục vụ");
                System.out.println("3.Chuyên viên");
                System.out.println("4.Giám sát");
                System.out.println("5.Quản lý");
                System.out.println("6.Giám đốc");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        return "Lễ tân";
                    case 2:
                        return "Phục vụ";
                    case 3:
                        return "Chuyên viên";
                    case 4:
                        return "Giám sát";
                    case 5:
                        return "Quản lý";
                    case 6:
                        return "Giám đốc";
                    default:
                        System.out.println("Thử lại");
                }
            }catch (NumberFormatException e){
                System.out.println("Vui lòng nhập số");
            }
        }
    }


    @Override
    public void edit() throws IOException {
        boolean result = false;
        System.out.println("Enter name employee want to edit");
        String findName = sc.nextLine();
        for (int i = 0; i < employeeList.size();i++) {
            if (employeeList.get(i).getName().equalsIgnoreCase(findName)) {
                System.out.println(employeeList.get(i));
                boolean check = true;
                while (check) {
                    System.out.println("1.Edit Id of Employee.");
                    System.out.println("2.Edit Name of Employee.");
                    System.out.println("3.Edit Date of birth.");
                    System.out.println("4.Edit Address.");
                    System.out.println("5.Edit Gender.");
                    System.out.println("6.Edit IdCard.");
                    System.out.println("7.Edit PhoneNumber.");
                    System.out.println("8.Edit Email.");
                    System.out.println("9.Edit Level.");
                    System.out.println("10.Edit Position.");
                    System.out.println("11.Edit Salary.");
                    System.out.println("0. Return Main menu");
                    System.out.println("Choose your option");
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1: {
                            System.out.println("Enter new Id: ");
                            employeeList.get(i).setId(inputIDEmployee(employeeList));
                            break;
                        }
                        case 2: {
                            System.out.println("Enter new Name: ");
                            employeeList.get(i).setName(sc.nextLine());
                            break;
                        }
                        case 3: {
                            System.out.println("Enter new Date of Birth: ");
                            employeeList.get(i).setDateOfBirth(RegexPerson.getDateOfBirth());
                            break;
                        }
                        case 4: {
                            System.out.println("Enter new Address: ");
                            employeeList.get(i).setAddress(sc.nextLine());
                            break;
                        }

                        case 5: {
                            System.out.println("Enter new Gender");
                            employeeList.get(i).setGender(sc.nextLine());
                            break;
                        }
                        case 6: {
                            System.out.println("Enter new IdCard: ");
                            employeeList.get(i).setIdCard(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                        case 7: {
                            System.out.println("Enter new Phone Number: ");
                            employeeList.get(i).setPhoneNumber(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                        case 8: {
                            System.out.println("Enter new Email: ");
                            employeeList.get(i).setEmail(sc.nextLine());
                            break;
                        }
                        case 9:
                            System.out.println("Enter new Level: ");
                            employeeList.get(i).setLevel(chooseLevel());
                            break;
                        case 10: {
                            System.out.println("Enter new Position: ");
                            employeeList.get(i).setPosition(choosePosition());
                            break;
                        }
                        case 11: {
                            System.out.println("Enter new Salary: ");
                            employeeList.get(i).setSalary(Double.parseDouble(sc.nextLine()));
                            break;
                        }
                        case 0:
                            check = false;
                            break;
                        default:
                            System.out.println("Retry");
                            break;
                    }
                }
                rewriteListEmployee();
                System.out.println("Update successful");
                result = true;
                break;
            }
        }
        if (!result) {
            System.out.println("Not Founded");
        }
    }

    private void rewriteListEmployee() throws IOException {
        File file = new File(EMPLOYEE_LIST);
        file.delete();

        for (Employee element : employeeList) {
            String line = element.getId() + "," +
                    element.getName() + "," +
                    element.getDateOfBirth() + "," +
                    element.getAddress() + "," +
                    element.getGender() + "," +
                    element.getIdCard() + "," +
                    element.getPhoneNumber() + "," +
                    element.getEmail() + "," +
                    element.getLevel() + "," +
                    element.getPosition() + "," +
                    element.getSalary();
            ReadAndWriteFurama.writeList(EMPLOYEE_LIST, line);
        }
    }

    @Override
    public void delete() throws IOException {
        boolean check = false;
        System.out.println("Enter name of Employee want to delete: ");
        String nameDelete = sc.nextLine();
        for (int i = 0; i < employeeList.size();i++) {
            if (employeeList.get(i).getName().equalsIgnoreCase(nameDelete)) {
                employeeList.remove(employeeList.get(i));
                rewriteListEmployee();
                System.out.println("Delete successful");
                display();
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not Founded");
        }
    }

    @Override
    public void findByName() {
        System.out.println("Enter name: ");
        String findName = sc.nextLine();
        boolean check = false;
        for (int i = 0; i < employeeList.size();i++) {
            if (employeeList.get(i).getName().equalsIgnoreCase(findName)) {
                System.out.println("Tên cần tìm là : " + employeeList.get(i));
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not Founded");
        }
    }
}
