/**
 * 
 */
package com.studioweb.application.user.context;

import org.springframework.stereotype.Component;

/**
 * @author MXA86SG
 * 
 * This context can be used only when user data should be retrieved 
 * for any purpose like to display or when user forgets his password
 */
@Component
public class RetrieveUserContext {
	
	private String userId;
	
	private String email;

	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
