package com.cabralbots.ecommerce.service;

import com.cabralbots.ecommerce.entity.Product;
import com.cabralbots.ecommerce.repository.ProductRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public void SaveProduct(Product product){
        productRepository.save(product);
    }

    public Optional<Product> GetProduct(Product product){
        return productRepository.findById(product.getIdProduct());
    }

    public List<Product> GetProducts(){
        return productRepository.findAll();
    }

    public void DeleteProduct(Product product){
        productRepository.delete(product);
    }
}
