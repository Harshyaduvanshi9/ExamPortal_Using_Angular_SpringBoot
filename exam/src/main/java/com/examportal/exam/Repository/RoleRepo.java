package com.examportal.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.exam.Model.Role;


public interface RoleRepo extends JpaRepository<Role,Long>{
   
    
}
