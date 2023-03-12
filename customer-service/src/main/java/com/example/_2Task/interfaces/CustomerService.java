package com.example._2Task.interfaces;

import com.example._3Domain.models.CustomerDto;

public interface CustomerService {
    Iterable<CustomerDto> getListCustomer();
    CustomerDto addCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(CustomerDto customerDto);

    void deleteCustomer(CustomerDto customerDto);
}
