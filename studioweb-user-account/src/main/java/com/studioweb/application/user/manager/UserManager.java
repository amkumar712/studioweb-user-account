package com.studioweb.application.user.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.studioweb.application.user.context.RetrieveUserContext;
import com.studioweb.application.user.model.UserAccount;
import com.studioweb.application.user.repository.UserRepository;

@Component
public class UserManager extends UserManagerAbstract {

	@Autowired
	UserRepository repo;
	
	@Override
	public UserAccount retrieveUser(RetrieveUserContext context) {
		
		if(context == null) {
			
			// log that the context is not available to get the user information
			
			return null;
		}
		
		UserAccount userAccount = null;
		
		String userId = context.getUserId();
		String email = context.getEmail();
		
		System.out.println("UserId --> " + userId);
		System.out.println("email --> " + email);
		
		if(!StringUtils.isEmpty(userId)) {
			userAccount = repo.getOne(userId);
		} 
		else {
			userAccount = repo.findByEmail(email);
		}
		
		return userAccount;
	}

	

}
