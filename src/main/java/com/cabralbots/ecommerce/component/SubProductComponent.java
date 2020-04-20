package com.cabralbots.ecommerce.component;

import com.cabralbots.ecommerce.base.BaseComponent;
import com.cabralbots.ecommerce.entity.SubProduct;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SubProductComponent extends BaseComponent<SubProduct> {
    @Override
    public void Save(SubProduct subProduct) {

    }

    @Override
    public List<SubProduct> GetList() {
        return null;
    }

    @Override
    public List<SubProduct> GetListByID(SubProduct subProduct) {
        return null;
    }

    @Override
    public void Delete(SubProduct subProduct) {

    }

    @Override
    public Optional<SubProduct> GetById(SubProduct subProduct) {
        return Optional.empty();
    }
}
