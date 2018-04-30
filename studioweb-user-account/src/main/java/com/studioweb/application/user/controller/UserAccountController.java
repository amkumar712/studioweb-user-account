/**
 * 
 */
package com.studioweb.application.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.studioweb.application.user.response.UserResponse;
import com.studioweb.application.user.service.UserService;

/**
 * @author MXA86SG
 *
 */
@Controller
public class UserAccountController {

	@Autowired
	UserService service;
	
	@RequestMapping("/")
	public String home(Model model) {
		System.out.println("THis is Controller");
		
		UserResponse user = service.retrieveUser("amkumar712", "amkumar712@gmail.com");
		
		model.addAttribute("user", user);
		
		return "home";
	}
	
}
