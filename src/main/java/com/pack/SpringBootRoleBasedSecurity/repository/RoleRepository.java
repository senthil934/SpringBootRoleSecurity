package com.pack.SpringBootRoleBasedSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pack.SpringBootRoleBasedSecurity.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	
}