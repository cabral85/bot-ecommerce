package com.cabralbots.ecommerce.service;

import com.cabralbots.ecommerce.entity.User;
import com.cabralbots.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void SaveUser(User user){
        userRepository.save(user);
    }

    public void DeleteUser(User user){
        userRepository.delete(user);
    }

    public User GetUserById(User user){
        return userRepository.findByLoginExceptPassword(user.getLogin());
    }

    public List<User> GetUsers(){
        return userRepository.findAllUsersExceptPassword();
    }
}
