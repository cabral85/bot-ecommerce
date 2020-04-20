package com.cabralbots.ecommerce.component;

import com.cabralbots.ecommerce.base.BaseComponent;
import com.cabralbots.ecommerce.entity.Product;
import com.cabralbots.ecommerce.entity.ProductImage;
import com.cabralbots.ecommerce.service.ProductImageService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductImageComponent extends BaseComponent<ProductImage> {
    @Autowired
    private ProductImageService productImageService;

    @Override
    public void Save(ProductImage productImage) {
        Optional<ProductImage> existingProduct = this.GetById(productImage);
        if(existingProduct.isPresent()){
            BeanUtils.copyProperties(productImage, existingProduct, "idProductImage");
        }
        else {
            BeanUtils.copyProperties(productImage, existingProduct);
        }
        productImageService.SaveProductImage(existingProduct.get());
    }

    @Override
    public List<ProductImage> GetList() {
        return null;
    }

    @Override
    public List<ProductImage> GetListByID(ProductImage productImage) {
        return productImageService.GetProductImages(productImage);
    }

    @Override
    public void Delete(ProductImage productImage) {
        productImageService.DeleteImage(productImage);
    }

    @Override
    public Optional<ProductImage> GetById(ProductImage productImage) {
        return productImageService.GetProductImage(productImage);
    }
}
