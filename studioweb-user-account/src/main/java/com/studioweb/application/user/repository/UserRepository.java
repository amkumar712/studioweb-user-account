/**
 * 
 */
package com.studioweb.application.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.studioweb.application.user.model.UserAccount;

/**
 * @author MXA86SG
 *
 */
@Repository
public interface UserRepository extends JpaRepository<UserAccount, String> {
	
	UserAccount findByEmail(String email);

}
