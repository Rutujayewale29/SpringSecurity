package com.example.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.User;
import com.example.Service.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;
	
    @GetMapping("/user")
	public List<User> getUser()
	{
		System.out.println("getting user");
		return userService.getUser();
	}
    @GetMapping("/current-user")
	public String getLoggedInUser(Principal principal)
	{
		return principal.getName();
	}
}
