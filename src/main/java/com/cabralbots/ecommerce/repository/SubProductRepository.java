package com.cabralbots.ecommerce.repository;

import com.cabralbots.ecommerce.entity.SubProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubProductRepository extends JpaRepository<SubProduct, Integer> {
    List<SubProduct> findAllByProduct_IdProduct(Integer productId);
}
