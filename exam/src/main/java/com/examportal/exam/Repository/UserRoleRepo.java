package com.examportal.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.exam.Model.UserRole;

public interface UserRoleRepo extends JpaRepository<UserRole,Long>{
    
}
