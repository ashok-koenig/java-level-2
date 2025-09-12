package com.example.products.service;

import com.example.products.entity.Product;
import com.example.products.exception.ProductNotFoundException;
import com.example.products.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Create and delete product
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException(id));
    }

    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }
}
