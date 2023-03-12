package com.example._1Application.rest;

import com.example._2Task.interfaces.CustomerService;
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
    public Iterable<Customer> getListCustomer(){
        return customerService.getListCustomer();
    }

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@RequestBody Customer customer){
        customerService.deleteCustomer(customer);
    }
}
