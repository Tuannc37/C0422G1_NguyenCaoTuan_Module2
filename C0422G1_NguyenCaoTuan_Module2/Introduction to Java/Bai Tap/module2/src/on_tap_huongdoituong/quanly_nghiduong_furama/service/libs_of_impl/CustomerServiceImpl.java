package services.libs_of_impl;

import models.person.Customer;
import services.libs_of_interface.CustomerService;
import utils.ReadAndWrite;
import utils.regex.RegexPerson;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends ServiceAbstract implements CustomerService {
    private static final String CUSTOMER_LIST = "src\\data\\customer.csv";
    private static List<Customer> customerList = getCustomerList();
    public static Scanner sc = new Scanner(System.in);


    @Override
    public void display() {
        customerList = getCustomerList();
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    public static List<Customer> getCustomerList() {
        List<Customer> listFileCustomer = new LinkedList<>();
        List<String[]> fileCustomer = ReadAndWrite.readList(CUSTOMER_LIST);
        for (String[] element : fileCustomer) {
            Customer customer = new Customer(Integer.parseInt(element[0]),
                    element[1],
                    element[2],
                    element[3],
                    element[4],
                    Integer.parseInt(element[5]),
                    Integer.parseInt(element[6]),
                    element[7],
                    element[8]
                    );
            listFileCustomer.add(customer);
        }
        return listFileCustomer;
    }

    public static int inputIDCustomer(List<Customer> customerList){
        System.out.println("Nhập ID khách hàng:");
        int id;
        int count;
        while (true){
            count = 0;
            id = RegexPerson.inputIntNumber();
            for (Customer customer : customerList) {
                if (id == customer.getId()){
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

    @Override
    public void addNew() throws IOException {
        int id = inputIDCustomer(customerList);
        System.out.println("Nhập tên khách hàng:");
        String name = sc.nextLine();
        String dateOfBirth = RegexPerson.getDateOfBirth();
        System.out.println("Nhập địa chỉ:");
        String address = sc.nextLine();
        System.out.println("Nhập giới tính:");
        String gender = sc.nextLine();
        System.out.println("Nhập số CMND:");
        int idCard = RegexPerson.inputIntNumber();
        System.out.println("Nhập số điện thoại:");
        int phoneNumber = RegexPerson.inputIntNumber();
        String email = RegexPerson.inputEmail();
        System.out.println("Chọn loại khách hàng:");
        String typeCustomer = chooseTypeCustomer();
        customerList.add(new Customer(id, name, dateOfBirth, address, gender, idCard, phoneNumber, email,typeCustomer));
        String line =  id+ "," +
                name + "," +
                dateOfBirth + "," +
                address + "," +
                gender + "," +
                idCard + "," +
                phoneNumber + "," +
                email + "," +
                typeCustomer;
        ReadAndWrite.writeList(CUSTOMER_LIST, line);
        System.out.println("Thêm mới thành công");
    }

    public String chooseTypeCustomer() {
        while (true) {
            try {
                System.out.println("1.Diamond");
                System.out.println("2.Platinum");
                System.out.println("3.Gold");
                System.out.println("4.Silver");
                System.out.println("5.Member");
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        return "Diamond";
                    case 2:
                        return "Platinum";
                    case 3:
                        return "Gold";
                    case 4:
                        return "Silver";
                    case 5:
                        return "Member";
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
        for (Customer customer : customerList) {
            if (customer.getName().contains(findName)) {
                System.out.println(customer.toString());
                boolean check = true;
                while (check) {
                    System.out.println("1.Edit Id of Customer.");
                    System.out.println("2.Edit Name of Customer.");
                    System.out.println("3.Edit Age.");
                    System.out.println("4.Edit Address.");
                    System.out.println("5.Edit Gender.");
                    System.out.println("6.Edit IdCard.");
                    System.out.println("7.Edit PhoneNumber.");
                    System.out.println("8.Edit Email.");
                    System.out.println("9.Edit Type customer.");
                    System.out.println("0. Return Main menu");
                    System.out.println("Choose your option");
                    int choose = Integer.parseInt(sc.nextLine());
                    switch (choose) {
                        case 1: {
                            System.out.println("Enter new Id: ");
                            customer.setId(inputIDCustomer(customerList));
                            break;
                        }
                        case 2: {
                            System.out.println("Enter new Name: ");
                            customer.setName(sc.nextLine());
                            break;
                        }
                        case 3: {
                            System.out.println("Enter new Age: ");
                            customer.setDateOfBirth(sc.nextLine());
                            break;
                        }
                        case 4: {
                            System.out.println("Enter new Address: ");
                            customer.setAddress(sc.nextLine());
                            break;
                        }

                        case 5: {
                            System.out.println("Enter new Gender");
                            customer.setGender(sc.nextLine());
                            break;
                        }
                        case 6: {
                            System.out.println("Enter new IdCard: ");
                            customer.setIdCard(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                        case 7: {
                            System.out.println("Enter new Phone Number: ");
                            customer.setPhoneNumber(Integer.parseInt(sc.nextLine()));
                            break;
                        }
                        case 8: {
                            System.out.println("Enter new Email: ");
                            customer.setEmail(sc.nextLine());
                            break;
                        }
                        case 9:
                            System.out.println("Choose new Type customer: ");
                            customer.setTypeCustomer(chooseTypeCustomer());
                            break;
                        case 0:
                            check = false;
                            break;
                        default:
                            System.out.println("Retry");
                            break;
                    }
                }
                rewriteListCustomer();
                System.out.println("Update successful");
                result = true;
                break;
            }
        }
        if (!result) {
            System.out.println("Not Founded");
        }
    }

    private void rewriteListCustomer() throws IOException {
        File file = new File(CUSTOMER_LIST);
        file.delete();
        List<String> myList = new ArrayList<>();
        for (Customer element : customerList) {
            String line =  element.getId()+ "," +
                    element.getName() + "," +
                    element.getDateOfBirth() + "," +
                    element.getAddress() + "," +
                    element.getGender() + "," +
                    element.getIdCard() + "," +
                    element.getPhoneNumber() + "," +
                    element.getEmail() + "," +
                    element.getTypeCustomer();
            myList.add(line);

        }
        ReadAndWrite.writeList(CUSTOMER_LIST, myList);
    }

    @Override
    public void delete() throws IOException {
        boolean check = false;
        System.out.println("Enter name of Employee want to delete: ");
        String nameDelete = sc.nextLine();
        for (Customer customer : customerList) {
            if (customer.getName().toLowerCase().contains(nameDelete)){
                customerList.remove(customer);
                rewriteListCustomer();
                System.out.println("Delete successful");
                display();
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Not Founded");
        }
    }

    @Override
    public void findByName() {
        customerList = getCustomerList();
        System.out.println("Enter name: ");
        String findName = sc.nextLine();
        boolean check = false;
        for (Customer customer : customerList) {
            if (customer.getName().toLowerCase().contains(findName.toLowerCase())) {
                System.out.println(customer.toString());
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Not Founded");
        }
    }


}
