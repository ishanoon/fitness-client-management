package io.shanoon.fitness.services;

import io.shanoon.fitness.responses.CustomerResponse;
import io.shanoon.fitness.models.Customer;
import io.shanoon.fitness.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    public CustomerResponse addCustomer(Customer customer){
        Customer newCustomer = new Customer(customer.getName(),customer.getGender(),customer.getRenewable());
        Customer addedCustomer = customerRepository.save(newCustomer);
        return new CustomerResponse(addedCustomer.getName(),addedCustomer.getGender(),addedCustomer.getCashPayable());
    }
    public List<Customer> getAllClients(){
        return customerRepository.findAll();
    }
}
