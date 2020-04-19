package com.cabralbots.ecommerce.repository;

import com.cabralbots.ecommerce.entity.UserProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProductRepository extends JpaRepository<UserProduct, Integer> {
}
