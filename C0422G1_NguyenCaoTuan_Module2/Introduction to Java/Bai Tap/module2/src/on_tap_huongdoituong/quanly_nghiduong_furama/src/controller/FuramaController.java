package on_tap_huongdoituong.quanly_nghiduong_furama.src.controller;

import on_tap_huongdoituong.quanly_nghiduong_furama.src.models.Facility;
import on_tap_huongdoituong.quanly_nghiduong_furama.src.service.impl.CustomerServiceImpl;
import on_tap_huongdoituong.quanly_nghiduong_furama.src.service.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
    private static CustomerServiceImpl customerService = new CustomerServiceImpl();
    private static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    private  static Facility facility = new Facility();
    public static void displayMainMenu(){
            boolean flag =true;
            do {
                System.out.println("------CHỨC NĂNG HỆ THỐNG------" +
                        "\n 1.Employee Management" +
                        "\n 2.Customer Management" +
                        "\n 3.Facility Management " +
                        "\n 4.Exit" +
                        "\n ----------END----------" );
                Scanner scanner = new Scanner(System.in);
                System.out.println("Chọn chức năng");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        displayEmployeeManager();
                        break;
                    case 2:
                        displayCustomerManager();
                        break;
                    case 3:
                        displayFacilityManager();
                        break;

                    default:
                        flag=false;
                }
            }while (flag);
    }

    private static void displayEmployeeManager(){
        boolean flag =true;
        do {
            System.out.println("------CHỨC NĂNG HỆ THỐNG------" +
                    "\n 1.Display list employees" +
                    "\n 2.Add new employee" +
                    "\n 3.Edit employee" +
                    "\n 4.Delete employee" +
                    "\n 5.Return main menu" +
                    "\n ---------END----------" );
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    employeeService.display();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    employeeService.edit();
                    break;
                case 4:
                    employeeService.delete();
                    break;
                case 5:
                    displayMainMenu();
                    break;

                default:
                    flag=false;
            }
        }while (flag);
    }
    private static void displayCustomerManager(){
        boolean flag =true;
        do {
            System.out.println("------CHỨC NĂNG HỆ THỐNG------" +
                    "\n 1.Display list Customer" +
                    "\n 2.Add new Customer" +
                    "\n 3.Edit Customer" +
                    "\n 4.Delete Customer" +
                    "\n 5.Return main menu" +
                    "\n ---------END----------" );
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    customerService.delete();
                    break;
                case 5:
                    displayMainMenu();
                    break;

                default:
                    flag=false;
            }
        }while (flag);
    }

    private static void displayFacilityManager(){
        boolean flag =true;
        do {
            System.out.println("------CHỨC NĂNG HỆ THỐNG------" +
                    "\n 1.Display list Facility" +
                    "\n 2.Add new Facility" +
                    "\n 3.Edit Facility" +
                    "\n 4.Delete Facility" +
                    "\n 5.Return main menu" +
                    "\n ----------END----------" );
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    customerService.display();
                    break;
                case 2:
                    customerService.add();
                    break;
                case 3:
                    customerService.edit();
                    break;
                case 4:
                    customerService.delete();
                    break;
                case 5:
                    displayMainMenu();
                    break;

                default:
                    flag=false;
            }
        }while (flag);
    }
}
