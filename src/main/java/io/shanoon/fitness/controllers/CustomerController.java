package io.shanoon.fitness.controllers;

import io.shanoon.fitness.responses.CustomerResponse;
import io.shanoon.fitness.models.Customer;
import io.shanoon.fitness.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;



    @PostMapping("/addClient")
    public CustomerResponse addCustomer(@RequestBody Customer addCustomer){
        return customerService.addCustomer(addCustomer);
    }

    @GetMapping("/allClients")
    public List<Customer> getAllClients(){
        return customerService.getAllClients();
    }

}
