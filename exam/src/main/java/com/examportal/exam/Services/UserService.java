package com.examportal.exam.Services;

import java.util.Set;

import com.examportal.exam.Model.User;
import com.examportal.exam.Model.UserRole;

public interface UserService {
    public User createUser(User user,Set<UserRole>userRoles) throws Exception;
    public User getUser(String userName, String password);
    public void deleteUser(Long userId);
    public User updateUser(User user);
   public User getUser1(String userName);
    
}
