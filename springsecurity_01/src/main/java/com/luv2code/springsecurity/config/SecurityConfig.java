package com.luv2code.springsecurity.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		// Add users for IN MEMORY AUTHENTICATION
		UserBuilder users = User.withDefaultPasswordEncoder();
		auth.inMemoryAuthentication()
			.withUser(users.username("abc").password("test1").roles("EMPLOYEE"));
		
		auth.inMemoryAuthentication()
			.withUser(users.username("abcd").password("test12").roles("MANAGER"));
		
		auth.inMemoryAuthentication()
			.withUser(users.username("abcde").password("test123").roles("ADMIN"));
		
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.anyRequest().authenticated()
			.and()
			.formLogin()
			.loginPage("/loginPage")
			.loginProcessingUrl("/authenticateUser")
			.permitAll()
			.and()
			.logout()
			.permitAll();
	}

}
