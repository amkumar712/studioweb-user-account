/**
 * 
 */
package com.studioweb.application.user.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.studioweb.application.user.model.UserAccount;
import com.studioweb.application.user.response.UserResponse;

/**
 * @author MXA86SG
 *
 */
@Component
public class RetrieveUserMapper implements IUserMapper<UserResponse, UserAccount> {

	@Autowired
	UserResponse response;
	
	@Override
	public UserResponse mapToResponse(UserAccount userAccount) {
		System.out.println("Method mapToResponse frm RetrieveuserMapper");
		
		if(userAccount != null) {
			System.out.println(userAccount.getUserId());
			System.out.println(userAccount.getFirstName());
			System.out.println(userAccount.getLastName());
			System.out.println(userAccount.getEmail());
			
			response.setUserId(userAccount.getUserId());
			response.setFirstName(userAccount.getFirstName());
			response.setLastName(userAccount.getLastName());
			response.setEmail(userAccount.getEmail());
			
		}
		
		return response;
	}

}
