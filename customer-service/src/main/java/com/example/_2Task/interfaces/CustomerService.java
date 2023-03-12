package com.example._2Task.interfaces;

import com.example._4Infraestructure.document.Customer;

public interface CustomerService {
    Iterable<Customer> getListCustomer();
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);
    void deleteCustomer(Customer customer);
}
