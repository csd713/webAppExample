package com.nullwelldev.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nullwelldev.login.LoginService;

@Controller
public class LoginController {

	//LoginService service = new LoginService(); // this is old way where we had to manage creating instance
	
	//New way using spring - It injects appropriate service here using Auto-wiring
	@Autowired
	LoginService service;
	
	

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	// @ResponseBody -> to send raw result
	public String showLoginPage() {
		return "login"; // login matches login.jsp - configure view resolver
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	// @ResponseBody -> to send raw result
	public String handleLoginRequest(@RequestParam String name, @RequestParam String password, ModelMap model) {

		model.put("name", name);
		model.put("password", password);
		if (service.isUserValid(name, password))
			return "welcome"; // login matches login.jsp - configure view resolver
		else {
			model.put("errorMessage", "Invalid credentials");
			return "login";
		}
	}
	
}
