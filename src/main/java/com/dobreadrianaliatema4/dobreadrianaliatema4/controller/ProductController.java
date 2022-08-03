package com.dobreadrianaliatema4.dobreadrianaliatema4.controller;

import com.dobreadrianaliatema4.dobreadrianaliatema4.model.Product;
import com.dobreadrianaliatema4.dobreadrianaliatema4.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/all")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("{id}")
    public Product getById(@PathVariable Integer id) {
        return productService.getById(id);
    }

    @PostMapping
    public Product save(@RequestBody Product product){
        return productService.save(product);
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        return productService.updateProduct(id,product);
    }

    @DeleteMapping("{id}")
    public void deleteCustomer(@PathVariable Integer id) {
        productService.deleteById(id);
    }
}
