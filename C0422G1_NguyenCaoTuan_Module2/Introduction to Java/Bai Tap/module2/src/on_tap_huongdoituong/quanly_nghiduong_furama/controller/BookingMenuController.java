package controllers;

import services.libs_of_impl.BookingServiceImpl;
import services.libs_of_impl.ContractServiceImpl;

import java.util.Scanner;

public class BookingMenuController {
    static Scanner sc = new Scanner(System.in);
    static BookingServiceImpl bookingService = new BookingServiceImpl();
    static ContractServiceImpl contractService = new ContractServiceImpl();

    public static void displayBookingMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1.Add new booking.");
            System.out.println("2.Display list booking.");
            System.out.println("3.Create new contracts.");
            System.out.println("4.Display list contracts.");
            System.out.println("5.Edit contracts.");
            System.out.println("0.Return main menu.");
            try {
                switch (Integer.parseInt(sc.nextLine())) {
                    case 1: {
                        bookingService.addBooking();
                        break;
                    }
                    case 2: {
                        bookingService.displayListBooking();
                        break;
                    }
                    case 3: {
                        contractService.createNewContract();
                        break;
                    }
                    case 4: {
                        contractService.displayListContract();
                        break;
                    }
                    case 5: {

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
