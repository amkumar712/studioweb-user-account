/**
 * 
 */
package com.studioweb.application.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studioweb.application.user.context.RetrieveUserContext;
import com.studioweb.application.user.manager.IUserManager;
import com.studioweb.application.user.mapper.IUserMapper;
import com.studioweb.application.user.model.UserAccount;
import com.studioweb.application.user.response.UserResponse;

/**
 * @author MXA86SG
 *
 */
@Component
public class UserService {

	@Autowired
	IUserManager<UserResponse> manager;
	
	@Autowired
	IUserMapper<UserResponse, UserAccount> mapper;
	
	@Autowired
	RetrieveUserContext context;
	
	public UserResponse retrieveUser(String userId, String email) {
		
		context.setUserId("amkumar712");
		context.setEmail("amkumar712@gmail.com");
		
		UserResponse response = manager.retrieveUser(mapper, context);
		
		if(response != null) {
			System.out.println(response.getEmail());
			
			System.out.println(response.getFirstName());
			
			System.out.println(response.getLastName());
		}
		
		return response;
	}
	
}
