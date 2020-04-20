package com.cabralbots.ecommerce.component;

import com.cabralbots.ecommerce.base.BaseComponent;
import com.cabralbots.ecommerce.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserComponent extends BaseComponent<User> {
    @Override
    public void Save(User user) {

    }

    @Override
    public List<User> GetList() {
        return null;
    }

    @Override
    public List<User> GetListByID(User user) {
        return null;
    }

    @Override
    public void Delete(User user) {

    }

    @Override
    public Optional<User> GetById(User user) {
        return Optional.empty();
    }
}
