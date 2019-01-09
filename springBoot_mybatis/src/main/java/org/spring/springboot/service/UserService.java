package org.spring.springboot.service;

import org.spring.springboot.entity.User;

public interface UserService {
    User findUser(String userName);
}
