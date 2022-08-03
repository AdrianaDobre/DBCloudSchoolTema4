package com.dobreadrianaliatema4.dobreadrianaliatema4.repository;

import com.dobreadrianaliatema4.dobreadrianaliatema4.model.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Integer> {
    List<Product> findAll();
}
