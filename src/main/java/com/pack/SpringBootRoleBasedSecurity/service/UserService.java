package com.pack.SpringBootRoleBasedSecurity.service;


import com.pack.SpringBootRoleBasedSecurity.model.User;

public interface UserService {
    void save(User user);
    void saveRole(Iterable i);
    User findByUsername(String username);
}