package com.principal.math.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.principal.math.model.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
