/**
 * 
 */
package com.studioweb.application.user.manager;

import com.studioweb.application.user.context.RetrieveUserContext;
import com.studioweb.application.user.mapper.IUserMapper;
import com.studioweb.application.user.model.UserAccount;
import com.studioweb.application.user.response.UserResponse;

/**
 * @author MXA86SG
 *
 */
public abstract class UserManagerAbstract implements IUserManager<UserResponse> {
		
	@Override
	public UserResponse retrieveUser(IUserMapper<UserResponse, UserAccount> mapper, RetrieveUserContext context) {
		if(context == null) {
			
		}
		UserAccount userAccount = retrieveUser(context);
		UserResponse userResponse = mapper.mapToResponse(userAccount);
		return userResponse;
	}
	
	public abstract UserAccount retrieveUser(RetrieveUserContext context);

}
