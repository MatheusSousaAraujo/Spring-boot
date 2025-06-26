package com.exemplo.demo.service;

import com.exemplo.demo.model.User;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    public List<User> getAllUsers() {
        return List.of(
            new User(1L, "João", "joao@email.com"),
            new User(2L, "Maria", "maria@email.com")
        );
    }
}
