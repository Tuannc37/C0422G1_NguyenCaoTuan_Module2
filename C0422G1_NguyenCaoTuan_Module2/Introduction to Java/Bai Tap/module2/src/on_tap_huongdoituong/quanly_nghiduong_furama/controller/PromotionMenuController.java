package controllers;

import java.util.Scanner;

public class PromotionMenuController {
    static Scanner sc = new Scanner(System.in);

    public static void displayPromotionMenu() {
        boolean check = true;
        while (check) {
            System.out.println("Display list customers use service");
            System.out.println("Display list customers get voucher");
            System.out.println("Return main menu");
            switch (Integer.parseInt(sc.nextLine())) {
                case 1: {
                    break;
                }

            }
        }
    }
}
