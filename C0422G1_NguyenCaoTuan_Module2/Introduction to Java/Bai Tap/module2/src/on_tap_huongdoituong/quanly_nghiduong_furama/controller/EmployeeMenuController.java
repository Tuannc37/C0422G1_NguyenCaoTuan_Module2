package controllers;

import services.libs_of_impl.EmployeeServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeMenuController {
    static Scanner sc = new Scanner(System.in);
    static EmployeeServiceImpl employeeService = new EmployeeServiceImpl();

    public static void displayEmployeeMenu() throws IOException {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list employees.");
            System.out.println("2. Add new employees.");
            System.out.println("3. Edit employee.");
            System.out.println("4. Delete employee.");
            System.out.println("5. Find employee.");
            System.out.println("0. Return main menu.");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1: {
                        employeeService.display();
                        break;
                    }
                    case 2: {
                        employeeService.addNew();
                        break;
                    }
                    case 3: {
                        employeeService.edit();
                        break;
                    }
                    case 4: {
                        employeeService.delete();
                        break;
                    }
                    case 5: {
                        employeeService.findByName();
                        break;
                    }
                    case 0: {
                        check = false;
                        break;
                    }
                    default: {
                        System.out.println("Retry");
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter number");
            }
        }
    }
}
