package com.cabralbots.ecommerce.component;

import com.cabralbots.ecommerce.base.BaseComponent;
import com.cabralbots.ecommerce.entity.Session;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class SessionComponent extends BaseComponent<Session> {
    @Override
    public void Save(Session session) {

    }

    @Override
    public List<Session> GetList() {
        return null;
    }

    @Override
    public List<Session> GetListByID(Session session) {
        return null;
    }

    @Override
    public void Delete(Session session) {

    }

    @Override
    public Optional<Session> GetById(Session session) {
        return Optional.empty();
    }
}
