package com.example.config;

import java.security.Principal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.bind.annotation.GetMapping;



@Configuration
public class AppConfig {
	@Bean
   public UserDetailsService userDetailsService()
   {
	   UserDetails user1=User.builder().username("rutuja").password(passwordEncoder().encode("rutu@123")).roles("admin").build();
	   UserDetails user2=User.builder().username("rushi").password(passwordEncoder().encode("rushi@123")).roles("admin").build();
	   return new InMemoryUserDetailsManager(user1,user2);
   }
	@Bean
	public PasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception
	{
		return builder.getAuthenticationManager();
	}
}
