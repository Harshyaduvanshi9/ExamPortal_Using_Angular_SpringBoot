package com.examportal.exam;

// import java.util.HashSet;
// import java.util.Set;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.examportal.exam.Model.Role;
// import com.examportal.exam.Model.User;
// import com.examportal.exam.Model.UserRole;
// import com.examportal.exam.Services.UserService;

@SpringBootApplication
public class ExamApplication {

	// @Autowired
	// private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}

	// @Override
	// public void run(String... args) throws Exception {
	// 	System.out.println("Starting New Code");
	// 	User user=new User();
	// 	user.setFirstName("Harsh");
	// 	user.setLastName("Yaduvanshi");
	// 	user.setUserName("Harshyaduvanshi9");
	// 	user.setPassword("Harsh@9644");
	// 	user.setEmail("2000hyhy@gmail.com");
	// 	user.setProfile("dafault.png");
	// 	user.setPhone("9644160101");
	// 	user.setGivenRole("Admin");

	// 	Role role1=new Role();
	// 	role1.setRolId(44L);
	// 	role1.setRoleName("ADMIN");

	// 	Set<UserRole>userRoleSet=new HashSet<>();
	// 	UserRole userRole=new UserRole();
	// 	userRole.setRole(role1);
	// 	userRole.setUser(user);
	// 	userRoleSet.add(userRole);

	// 	User user1=this.userService.createUser(user, userRoleSet);
	// 	System.out.println(user1.getUserName());


		

	// }

		
		
	

}
