package com.example.products.service;

import com.example.products.entity.Product;
import com.example.products.exception.ProductNotFoundException;
import com.example.products.repository.ProductRepository;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Create and delete product
    @CacheEvict(value = "products", allEntries = true)
    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    // Pagination
    @Cacheable(value = "products")
    public Page<Product> getAllProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }

    public Product getProductById(Integer id){
        return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException(id));
    }

    @CacheEvict(value = "products", allEntries = true)
    public void deleteProductById(Integer id){
        productRepository.deleteById(id);
    }
}
