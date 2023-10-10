package com.examportal.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examportal.exam.Model.User;

public interface UserRepo extends JpaRepository<User,Long>{
    public User findByUserName(String username);
    public User findByUserNameAndPassword(String username, String password);
    
    
}
