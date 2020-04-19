package com.cabralbots.ecommerce.service;

import com.cabralbots.ecommerce.entity.Product;
import com.cabralbots.ecommerce.entity.ProductImage;
import com.cabralbots.ecommerce.repository.ProductImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductImageService {
    @Autowired
    private ProductImageRepository productImageRepository;

    public void SaveProductImage(ProductImage productImage){
        productImageRepository.save(productImage);
    }

    public Optional<ProductImage> GetProductImage(ProductImage productImage){
        return productImageRepository.findById(productImage.getIdProductImage());
    }

    public List<ProductImage> GetProductImages(Product product){
        return productImageRepository.findAllByProduct_IdProduct(product.getIdProduct());
    }

    public void DeleteImage(ProductImage productImage){
        productImageRepository.deleteById(productImage.getIdProductImage());
    }
}
