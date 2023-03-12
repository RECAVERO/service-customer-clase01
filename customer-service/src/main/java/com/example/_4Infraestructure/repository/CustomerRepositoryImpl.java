package com.example._4Infraestructure.repository;

import com.example._3Domain.contract.CustomerRepository;
import com.example._4Infraestructure.document.Customer;
import com.example._4Infraestructure.repositorymongodb.CustomerRepositoryMongoDB;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private final CustomerRepositoryMongoDB customerRepositoryMongoDB;

    public CustomerRepositoryImpl(CustomerRepositoryMongoDB customerRepositoryMongoDB) {
        this.customerRepositoryMongoDB = customerRepositoryMongoDB;
    }


    @Override
    public Iterable<Customer> getListCustomer() {
        return customerRepositoryMongoDB.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepositoryMongoDB.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepositoryMongoDB.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        customerRepositoryMongoDB.delete(customer);
    }

}
