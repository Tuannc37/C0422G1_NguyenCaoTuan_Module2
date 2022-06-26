package on_tap_huongdoituong.quanly_nghiduong_furama.src.service.impl;

import on_tap_huongdoituong.quanly_nghiduong_furama.src.models.Customer;
import on_tap_huongdoituong.quanly_nghiduong_furama.src.service.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer());
        customerList.add(new Customer());
        customerList.add(new Customer());
        customerList.add(new Customer());
        customerList.add(new Customer());
        customerList.add(new Customer());
    }
    @Override
    public void searchByName() {

    }

    @Override
    public void add() {
         //

    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

    @Override
    public void display() {

    }
}
