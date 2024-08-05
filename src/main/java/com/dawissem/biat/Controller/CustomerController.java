package com.dawissem.biat.Controller;

import com.dawissem.biat.Entity.Customer;
import com.dawissem.biat.Repository.CustomerRepository;
import com.dawissem.biat.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CustomerController {
            @Autowired
        private CustomerService customerService;
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer/add")
    public String addCustomer(@RequestBody Customer customer){
         return  customerService.addCustomer(customer);
    }
}
