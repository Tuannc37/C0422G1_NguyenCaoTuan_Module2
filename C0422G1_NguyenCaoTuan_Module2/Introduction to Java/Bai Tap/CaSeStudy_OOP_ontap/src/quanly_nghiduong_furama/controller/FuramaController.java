package on_tap_huongdoituong.quanly_nghiduong_furama.controller;


import java.io.IOException;
import java.util.Scanner;

import static on_tap_huongdoituong.quanly_nghiduong_furama.controller.BookingMenuController.displayBookingMenu;
import static on_tap_huongdoituong.quanly_nghiduong_furama.controller.CustomerMenuController.displayCustomerMenu;
import static on_tap_huongdoituong.quanly_nghiduong_furama.controller.EmployeeMenuController.displayEmployeeMenu;
import static on_tap_huongdoituong.quanly_nghiduong_furama.controller.FacilityMenuController.displayFacilityMenu;
import static on_tap_huongdoituong.quanly_nghiduong_furama.controller.PromotionMenuController.displayPromotionMenu;

public class FuramaController {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        displayMainMenuFurama();
    }

    public static void displayMainMenuFurama() throws IOException {
        boolean check = true;
        while (check) {
            System.out.println("1. Employee Management.");
            System.out.println("2. Customer Management.");
            System.out.println("3. Facility Management.");
            System.out.println("4. Booking Management.");
            System.out.println("5. Promotion Management.");
            System.out.println("6. Exit.");
            System.out.println("Choose your option: ");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1:
                        displayEmployeeMenu();
                        break;
                    case 2:
                        displayCustomerMenu();
                        break;
                    case 3:
                        displayFacilityMenu();
                        break;
                    case 4:
                        displayBookingMenu();
                        break;
                    case 5:
                        displayPromotionMenu();
                        break;
                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Retry");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Retry");
            }
        }
    }
}
