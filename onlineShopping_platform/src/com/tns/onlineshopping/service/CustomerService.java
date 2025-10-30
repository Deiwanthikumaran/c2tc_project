package com.tns.onlineshopping.service;
import com.tns.onlineshopping.entity.Customer;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private static List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer findById(int id) {
        for (Customer c : customers) {
            if (c.getUserId() == id)
                return c;
        }
        return null;
    }
}
