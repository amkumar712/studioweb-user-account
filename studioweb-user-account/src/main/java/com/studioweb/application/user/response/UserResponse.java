/**
 * 
 */
package com.studioweb.application.user.response;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author MXA86SG
 *
 */
@Component
public class UserResponse {
	
	/**
	 * User Id which is unique for each user
	 */
	private String userId;
	
	/** 
	 * describes First Name of user
	 */
	private String firstName;
	
	/**
	 * describes Last Name of user
	 */
	private String lastName;
	
	/**
	 * Gives Full name of user. Combination of First name and 
	 * Last Name. Middle Name and Salutation will be optional.
	 */
	private String fullName;
	
	/**
	 * email id of user which is also unique for each user.
	 * It can be used to retrieve account if user forgets his id.
	 */
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
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		
		if (!StringUtils.isEmpty(firstName)) {
			fullName += firstName;
		}
		
		if(!StringUtils.isEmpty(lastName)) {
			fullName += " " + lastName;
		}
		
		return fullName;
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
