package com.dobreadrianaliatema4.dobreadrianaliatema4.controller;

import com.dobreadrianaliatema4.dobreadrianaliatema4.model.Customer;
import com.dobreadrianaliatema4.dobreadrianaliatema4.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("{id}")
    public Customer getById(@PathVariable Integer id) {
        return customerService.getById(id);
    }

    @PostMapping
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    @PutMapping("{id}")
    public Customer updateCustomer(@PathVariable Integer id,@RequestBody Customer customer)
    {
        return customerService.updateCustomer(id,customer);
    }
    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        customerService.deleteById(id);
    }
}
