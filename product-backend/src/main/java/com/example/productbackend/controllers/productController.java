package com.example.productbackend.controllers;

import com.example.productbackend.models.Product;
import com.example.productbackend.repositories.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
public class productController {

    @Autowired
    private IProductRepository repository;

    @GetMapping("/products")
    public List<Product> getProducts() { return repository.findAll(); }

    @GetMapping("/products/{id}")
    public Optional<Product> getProductById(@PathVariable Integer id) { return repository.findById(id); };


    @PostMapping("/products")
    public Product postProduct(@RequestBody Product product) {
        repository.save(product);
        return repository.save(product);
    }

    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable int id, @Validated @RequestBody Product productRequest) {
        return repository.findById(id)
                .map(product -> {
                    if (productRequest.getName() != null) {
                        product.setName(productRequest.getName());
                    }
                    if (productRequest.getDescription() != null) {
                        product.setDescription(productRequest.getDescription());
                    }
                    if (productRequest.getInStock() != null) {
                        product.setInStock(productRequest.getInStock());
                    }
                    return repository.save(product);
                }).orElseThrow(() -> new EntityNotFoundException("No product found with ID " + id));
    }

    @DeleteMapping("products/{id}")
    public String deleteProduct(@PathVariable Integer id) {
        repository.deleteById(id);
        return "Product Deleted";
    }


}
