package com.examportal.exam.Services.impl;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.examportal.exam.Model.User;
import com.examportal.exam.Model.UserRole;
import com.examportal.exam.Repository.RoleRepo;
import com.examportal.exam.Repository.UserRepo;

import com.examportal.exam.Services.UserService;



@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    

    @Override
    
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local=this.userRepo.findByUserName(user.getUserName());
        if(local!=null)
        {
            System.out.println("User is aleready there !!!");
            throw new Exception("User already Present !!!");
        }
        else
        {
            for(UserRole ur:userRoles)
            {
                roleRepo.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
            local=this.userRepo.save(user);

        }
        return local;

        
        
    }

    @Override
    public User getUser(String userName, String password) {
        return this.userRepo.findByUserNameAndPassword(userName,password);
        
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepo.deleteById(userId);

        
    }

    @Override
    public User updateUser(User u1) {
        return this.userRepo.save(u1);
        // return u1;
        
    }

    @Override
    public User getUser1(String userName)
    {
        return this.userRepo.findByUserName(userName);
        
    }

    

    
    
}
