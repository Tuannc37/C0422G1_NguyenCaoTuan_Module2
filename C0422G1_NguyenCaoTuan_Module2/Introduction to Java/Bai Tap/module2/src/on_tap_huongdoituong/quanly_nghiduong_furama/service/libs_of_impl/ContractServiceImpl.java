package services.libs_of_impl;

import models.Booking;
import models.Contract;
import models.person.Customer;
import services.libs_of_interface.ContractService;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    @Override
    public void createNewContract() {
//        Queue<Booking> bookingQueue = new LinkedList<>();
//        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
//        for (Booking booking : bookingSet) {
//            bookingQueue.add(booking);
//        }
//        while (!bookingQueue.isEmpty()) {
//            Booking booking = bookingQueue.poll();
//            Customer customer = booking.getCustomer();
//
//            System.out.println("Creating contract for Booking: " + booking.toString());
//            System.out.println("Creating contract for Customer: " + customer.toString());
//            System.out.println("Enter ID of Contract: ");
//            String id = sc.nextLine();
//            System.out.println("Enter Prepayment: ");
//            String prePayment = sc.nextLine();
//            System.out.println("Enter Expense: ");
//            String expense = sc.nextLine();
//
//            Contract contract = new Contract(id, booking, prePayment, expense, customer);
//            contractList.add(contract);
//            System.out.println("Created successful Contract: " + contract.toString());
//        }
    }

    @Override
    public void displayListContract() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {

    }
}
