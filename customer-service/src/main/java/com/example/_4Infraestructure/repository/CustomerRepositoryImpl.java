package com.example._4Infraestructure.repository;

import com.example._3Domain.contract.CustomerRepository;
import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.document.Customer;
import com.example._4Infraestructure.repositorymongodb.CustomerRepositoryMongoDB;
import org.springframework.stereotype.Repository;

import java.util.stream.Collectors;

import static com.example._5Util.convert.Convert.dtoToEntity;
import static com.example._5Util.convert.Convert.entityToDto;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private final CustomerRepositoryMongoDB customerRepositoryMongoDB;

    public CustomerRepositoryImpl(CustomerRepositoryMongoDB customerRepositoryMongoDB) {
        this.customerRepositoryMongoDB = customerRepositoryMongoDB;
    }


    @Override
    public Iterable<CustomerDto> getListCustomer() {
        return customerRepositoryMongoDB.findAll()
                .stream()
                .map(customer->entityToDto(customer))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDto addCustomer(CustomerDto customerDto) {
        return entityToDto(customerRepositoryMongoDB.save(dtoToEntity(customerDto)));
    }

    @Override
    public CustomerDto updateCustomer(CustomerDto customerDto) {
        return entityToDto(customerRepositoryMongoDB.save(dtoToEntity(customerDto)));
    }

    @Override
    public void deleteCustomer(CustomerDto customerDto) {
        customerRepositoryMongoDB.delete(dtoToEntity(customerDto));
    }

}
