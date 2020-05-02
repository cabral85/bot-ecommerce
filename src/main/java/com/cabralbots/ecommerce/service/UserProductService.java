package com.cabralbots.ecommerce.service;

import com.cabralbots.ecommerce.entity.Product;
import com.cabralbots.ecommerce.entity.User;
import com.cabralbots.ecommerce.entity.UserProduct;
import com.cabralbots.ecommerce.repository.UserProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserProductService {
    @Autowired
    private UserProductRepository userProductRepository;

    public void SaveUserProduct(UserProduct userProduct){
        userProductRepository.save(userProduct);
    }

    public void DeleteUserProduct(UserProduct userProduct){
        userProductRepository.delete(userProduct);
    }

    public List<UserProduct> ListUserProducts(UserProduct userProduct){
        return userProductRepository.findAllByUser(userProduct.getUser());
    }
}
