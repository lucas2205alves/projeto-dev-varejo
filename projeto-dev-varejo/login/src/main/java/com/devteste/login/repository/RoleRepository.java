package com.devteste.login.repository;

import com.devteste.login.model.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleRepository extends CrudRepository<Role, Long> {
    Role findByRole(String role);
}