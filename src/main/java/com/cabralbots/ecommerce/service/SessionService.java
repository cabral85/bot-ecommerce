package com.cabralbots.ecommerce.service;

import com.cabralbots.ecommerce.entity.Session;
import com.cabralbots.ecommerce.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    public List<Session> ListSessions(Long userId){
        return sessionRepository.findAllByUser_IdUserProduct_User(userId);
    }

    public void StartSession(Session session){
        sessionRepository.save(session);
    }

    public void DisconnectSession(Session session){
        sessionRepository.delete(session);
    }

    public Session CheckSession(Long idProduct, Long idUser){
        return sessionRepository.findByUserProduct_IdUserProductAndUserIdUserProduct_User(idProduct, idUser);
    }
}
