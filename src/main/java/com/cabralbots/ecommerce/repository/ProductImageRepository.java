package com.cabralbots.ecommerce.repository;

import com.cabralbots.ecommerce.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductImageRepository extends JpaRepository<ProductImage, Integer> {
    List<ProductImage> findAllByProduct_IdProduct(Integer idProduct);
}
