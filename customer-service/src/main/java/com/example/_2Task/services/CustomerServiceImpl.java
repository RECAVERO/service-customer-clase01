package com.example._2Task.services;

import com.example._2Task.interfaces.CustomerService;
import com.example._3Domain.contract.CustomerRepository;
import com.example._4Infraestructure.document.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @Override
    public Iterable<Customer> getListCustomer() {
        return customerRepository.getListCustomer();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepository.addCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepository.updateCustomer(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepository.deleteCustomer(customer);
    }
}
