package com.dawissem.biat.Service;

import com.dawissem.biat.DAO.CustomerDAO;
import com.dawissem.biat.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService  {
        @Autowired
        public CustomerDAO customerDAO;
    public String addCustomer(Customer customer){
        customerDAO.save(customer);
        return "Customer added";
    }
}
