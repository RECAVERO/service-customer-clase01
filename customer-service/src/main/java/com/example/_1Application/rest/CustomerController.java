package com.example._1Application.rest;

import com.example._2Task.interfaces.CustomerService;
import com.example._3Domain.models.CustomerDto;
import com.example._4Infraestructure.document.Customer;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping
    public Iterable<CustomerDto> getListCustomer(){
        return customerService.getListCustomer();
    }

    @PostMapping
    public CustomerDto addCustomer(@RequestBody CustomerDto customerDto){
        return customerService.addCustomer(customerDto);
    }

    @PutMapping
    public CustomerDto updateCustomer(@RequestBody CustomerDto customerDto){
        return customerService.updateCustomer(customerDto);
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody CustomerDto customerDto){
        customerService.deleteCustomer(customerDto);
    }
}
