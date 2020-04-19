package com.cabralbots.ecommerce.repository;

import com.cabralbots.ecommerce.entity.UserProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserProductRepository extends JpaRepository<UserProduct, Integer> {
    List<UserProduct> findAllByProduct_IdProduct(Integer idProduct);
}
