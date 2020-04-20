package com.cabralbots.ecommerce.component;

import com.cabralbots.ecommerce.base.BaseComponent;
import com.cabralbots.ecommerce.entity.Product;
import com.cabralbots.ecommerce.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductComponent extends BaseComponent<Product> {

    @Autowired
    private ProductService productService;

    @Override
    public void Save(Product product) {
        Optional<Product> existingProduct = this.GetById(product);
        if(existingProduct.isPresent()){
            BeanUtils.copyProperties(product, existingProduct, "idProduct");
        }
        else {
            BeanUtils.copyProperties(product, existingProduct);
        }
        productService.SaveProduct(existingProduct.get());
    }

    @Override
    public List<Product> GetList() {
        return productService.GetProducts();
    }

    @Override
    public List<Product> GetListByID(Product product) {
        return null;
    }

    @Override
    public void Delete(Product product) {
        if(this.GetById(product).isPresent())
            productService.DeleteProduct(product);
    }

    @Override
    public Optional<Product> GetById(Product product) {
        return productService.GetProduct(product);
    }
}
