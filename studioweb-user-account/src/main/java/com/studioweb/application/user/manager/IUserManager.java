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
public interface IUserManager <RESPONSE> {
	
	public RESPONSE retrieveUser(IUserMapper<UserResponse, UserAccount> mapper, RetrieveUserContext context);

}
