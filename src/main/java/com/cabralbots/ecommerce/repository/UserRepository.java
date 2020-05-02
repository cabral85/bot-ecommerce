package com.cabralbots.ecommerce.repository;

import com.cabralbots.ecommerce.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT u.idUser, u.name, u.lastName, u.email, u.login, u.createDate FROM User u where  u.login = ?1")
    User findByLoginExceptPassword(String login);

    @Query("select u.idUser, u.name, u.lastName, u.email, u.login, u.createDate from User u")
    List<User> findAllUsersExceptPassword();
}
