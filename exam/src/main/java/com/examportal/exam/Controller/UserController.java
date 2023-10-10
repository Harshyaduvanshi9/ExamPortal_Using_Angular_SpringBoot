package com.examportal.exam.Controller;

import java.util.HashSet;
import java.util.Set;



import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examportal.exam.Model.Role;
import com.examportal.exam.Model.User;
import com.examportal.exam.Model.UserRole;

import com.examportal.exam.Services.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin("*")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User createUser( @RequestBody User user) throws Exception
    {
        user.setProfile("default.png");
        user.setGivenRole("Customer");
        Set<UserRole>roles=new HashSet<>();
        Role role=new Role();
        role.setRolId(45L);
        role.setRoleName("NORMAL");

        UserRole userRole=new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);
        
        return this.userService.createUser(user, roles);

    }

    @GetMapping("/{userName}")
    public User getUser(@PathVariable("userName") String userName)
    {
        System.out.println("mmmmmm"+userName);
        
        

        return this.userService.getUser1(userName);

    }
    
  


    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId)
    {
        this.userService.deleteUser(userId);

    }

    // @PostMapping("/update/{userName}")
    // public User updateUser(@PathVariable("userName") String userName, Model model) {

    //     User user = userService.updateUser(userName);

    //     if (user != null) {
    //         model.addAttribute("newUser", user);
    //         return this.userService.getUser(userName);
    //     } else {
           
    //         return null;
    //     }
    // }

    @PutMapping("/")
     public User updateme(@RequestBody User user) 
     {
        return this.userService.updateUser(user);
     }

    @PostMapping("/auth") 
    public User  userauth(@RequestBody User user) throws Exception 
    {
        String uName=user.getUserName();
        String uPass=user.getPassword();
        // System.out.println("user is in json "+user);

        System.out.println("user is "+user.getUserName());

        User u1=userService.getUser(uName,uPass);
        // System.out.println("find user was "+a.getPhone());
        // System.out.println("u1 is "+u1.getUserName());


        // System.out.println("***********"+u1.getUserRoles());
       
       
        // System.out.println("ye rolr hai iske");




       
        // System.out.println("u1="+u1);
        if (u1 != null) {
            
            // return this.userService.getUser(uName);
            System.out.println("tension mat lo");
            return u1;
        } else {
           
            // return  null;
            System.out.println("tension lene ki jarurat hai");
            throw new Exception("User already Present !!!");
        }

        
    
    }
    





    
}
