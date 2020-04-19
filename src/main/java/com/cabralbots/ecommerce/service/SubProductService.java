package com.cabralbots.ecommerce.service;

import com.cabralbots.ecommerce.entity.SubProduct;
import com.cabralbots.ecommerce.repository.SubProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/***
 * Configurações para uso nos robos
 */
@Service
public class SubProductService {
    @Autowired
    private SubProductRepository subProductRepository;

    public void SaveSubProduct(SubProduct subProduct){
        subProductRepository.save(subProduct);
    }

    public List<SubProduct> GetSubProductsByProductId(SubProduct subProduct){
        return subProductRepository.findAllByProduct_IdProduct(subProduct.getProduct().getIdProduct());
    }

    public void DeleteSubProduct(SubProduct subProduct){
        subProductRepository.delete(subProduct);
    }
}
