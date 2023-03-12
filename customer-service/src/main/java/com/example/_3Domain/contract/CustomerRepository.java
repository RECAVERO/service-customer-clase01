package com.example._3Domain.contract;

import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.document.Customer;

public interface CustomerRepository {
    Iterable<CustomerDto> getListCustomer();
    CustomerDto addCustomer(CustomerDto customerDto);
    CustomerDto updateCustomer(CustomerDto customerDto);

    void deleteCustomer(CustomerDto customerDto);
}
