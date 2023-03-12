package com.example._3Domain.contract;

import com.example._4Infraestructure.document.Customer;

public interface CustomerRepository {
    Iterable<Customer> getListCustomer();
    Customer addCustomer(Customer customer);
    Customer updateCustomer(Customer customer);

    void deleteCustomer(Customer customer);
}
