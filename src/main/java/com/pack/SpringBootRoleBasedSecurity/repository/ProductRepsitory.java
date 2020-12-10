package com.pack.SpringBootRoleBasedSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.SpringBootRoleBasedSecurity.model.Product;

public interface ProductRepsitory extends JpaRepository<Product, Long> {

}
