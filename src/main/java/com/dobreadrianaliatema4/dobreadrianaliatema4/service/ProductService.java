package com.dobreadrianaliatema4.dobreadrianaliatema4.service;

import com.dobreadrianaliatema4.dobreadrianaliatema4.model.Product;
import com.dobreadrianaliatema4.dobreadrianaliatema4.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        List<Product> aux = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(aux::add);
        return aux;
    }

    public Product getById(Integer id) {
        return productRepository.findById(id).get();
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Integer id,Product product) {
        try {
            Product newProduct = productRepository.findById(id).get();
            newProduct.setName(product.getName());
            newProduct.setStock(product.getStock());
            return productRepository.save(newProduct);

        } catch (Exception e) {
            System.out.println("The product with this id does not exist");
            return null;
        }
    }

    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }
}
