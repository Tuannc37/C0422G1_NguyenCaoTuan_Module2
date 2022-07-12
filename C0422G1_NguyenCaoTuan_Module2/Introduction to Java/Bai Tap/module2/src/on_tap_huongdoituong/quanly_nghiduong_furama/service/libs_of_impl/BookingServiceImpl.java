package services.libs_of_impl;

import models.Booking;
import models.facility.Facility;
import models.person.Customer;
import services.libs_of_interface.BookingService;
import utils.ReadAndWrite;
import utils.regex.RegexDateTime;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    public static final String BOOKING_LIST = "src\\data\\booking.csv";
    static Scanner sc = new Scanner(System.in);
    static Set<Booking> bookingSet = ReadAndWrite.readBooking();
    static List<Customer> customerList = CustomerServiceImpl.getCustomerList();
    static Map<Facility, Integer> facilityIntegerMap = ReadAndWrite.readFacilityCsv();
    public Set<Booking> sendBooking(){
        return bookingSet;
    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()){
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        String startDate = RegexDateTime.inputStartDay();
        String endDate = RegexDateTime.inputStartDay();
        Booking booking = new Booking(id, startDate, endDate, customer.getName(), facility.getNameService());
        bookingSet.add(booking);
        ReadAndWrite.writeBookingFile(bookingSet,BOOKING_LIST);
        System.out.println("Add new successful");
    }

    @Override
    public void displayListBooking() {
        ReadAndWrite.readBooking();
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer(){
        System.out.println("List Customer: ");
        for (Customer customer : customerList){
            System.out.println(customer.toString());
        }

        System.out.println("Enter ID of Customer: ");
        boolean check = true;
        int id = Integer.parseInt(sc.nextLine());

        while (check){
            for (Customer customer : customerList) {
                if (id == customer.getId()){
                    return customer;
                }
            }
            if (check){
                System.out.println("Please re-enter Id of Customer: ");
                id = Integer.parseInt(sc.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility(){
        System.out.println("List Facility: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()){
            System.out.println(entry.getKey().toString());
        }

        System.out.println("Enter ID of Facility: ");
        boolean check = true;
        String id = sc.nextLine();

        while (check){
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())){
                    return entry.getKey();
                }
            }
            if (check){
                System.out.println("Please re-enter Id of Facility: ");
                id = sc.nextLine();
            }
        }
        return null;
    }
}
