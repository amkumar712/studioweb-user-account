/**
 * 
 */
package com.studioweb.application.user.model;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author MXA86SG
 *
 */
//@Entity
//@Table (name="user_login")
public class UserLogin {
	
	private Integer id;
	
	// one to one mapping with user_account table.
	private String userId;

	private String passwordHash;
	
	private String passwordSalt;

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
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param passwordHash the passwordHash to set
	 */
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	/**
	 * @param passwordSalt the passwordSalt to set
	 */
	public void setPasswordSalt(String passwordSalt) {
		this.passwordSalt = passwordSalt;
	}
}
