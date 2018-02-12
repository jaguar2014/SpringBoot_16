package com.ashu.demo.repository;

import com.ashu.demo.security.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Long> {

Role findByRole(String role);
}
