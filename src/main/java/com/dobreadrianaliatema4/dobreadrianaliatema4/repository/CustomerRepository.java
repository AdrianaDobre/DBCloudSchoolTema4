package com.dobreadrianaliatema4.dobreadrianaliatema4.repository;

import com.dobreadrianaliatema4.dobreadrianaliatema4.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findAll();
}
