package com.cabralbots.ecommerce.component;

import com.cabralbots.ecommerce.base.BaseComponent;
import com.cabralbots.ecommerce.entity.UserProduct;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserProductComponent extends BaseComponent<UserProduct> {
    @Override
    public void Save(UserProduct userProduct) {

    }

    @Override
    public List<UserProduct> GetList() {
        return null;
    }

    @Override
    public List<UserProduct> GetListByID(UserProduct userProduct) {
        return null;
    }

    @Override
    public void Delete(UserProduct userProduct) {

    }

    @Override
    public Optional<UserProduct> GetById(UserProduct userProduct) {
        return Optional.empty();
    }
}
