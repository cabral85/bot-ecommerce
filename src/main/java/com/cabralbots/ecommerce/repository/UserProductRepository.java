package com.cabralbots.ecommerce.repository;

import com.cabralbots.ecommerce.entity.User;
import com.cabralbots.ecommerce.entity.UserProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserProductRepository extends JpaRepository<UserProduct, Long> {
    List<UserProduct> findAllByProduct_IdProduct(Long idProduct);
    List<UserProduct> findAllByUser(User user);
}
