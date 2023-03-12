package com.example._5Util.convert;

import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.document.Customer;
import org.springframework.beans.BeanUtils;

public class Convert {
    public static CustomerDto entityToDto(Customer customer) {
        CustomerDto customerDto = new CustomerDto();
        BeanUtils.copyProperties(customer, customerDto);
        return customerDto;
    }

    public static Customer dtoToEntity(CustomerDto customerDto) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDto, customer);
        return customer;
    }
}
