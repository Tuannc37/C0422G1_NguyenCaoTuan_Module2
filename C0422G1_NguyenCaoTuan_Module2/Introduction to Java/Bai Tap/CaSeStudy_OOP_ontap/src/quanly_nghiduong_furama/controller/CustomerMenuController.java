package on_tap_huongdoituong.quanly_nghiduong_furama.controller;


import on_tap_huongdoituong.quanly_nghiduong_furama.service.libs_of_impl.CustomerServiceImpl;

import java.io.IOException;
import java.util.Scanner;

public class CustomerMenuController {
    static Scanner sc = new Scanner(System.in);
    static CustomerServiceImpl customerService = new CustomerServiceImpl();

    public static void displayCustomerMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Display list customers.");
            System.out.println("2. Add new customer.");
            System.out.println("3. Edit customer.");
            System.out.println("4. Delete customer.");
            System.out.println("5. Find customer.");
            System.out.println("0. Return main menu");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1: {
                        customerService.display();
                        break;
                    }
                    case 2: {
                        customerService.addNew();
                        break;
                    }
                    case 3: {
                        customerService.edit();
                        break;
                    }
                    case 4: {
                        customerService.delete();
                        break;
                    }
                    case 5: {
                        customerService.findByName();
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
            } catch (NumberFormatException | IOException e) {
                System.out.println("Please enter number");
            }
        }
    }
}
