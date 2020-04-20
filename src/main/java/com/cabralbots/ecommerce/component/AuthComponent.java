package com.cabralbots.ecommerce.component;

import com.cabralbots.ecommerce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthComponent {
    @Autowired
    private UserService userService;
}
