package com.cabralbots.ecommerce.repository;

import com.cabralbots.ecommerce.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SessionRepository extends JpaRepository<Session, Long> {
    List<Session> findAllByUser_IdUserProduct_User(Long userId);
    Session findByUserProduct_IdUserProductAndUserIdUserProduct_User(Long idProduct, Long idUser);
}
