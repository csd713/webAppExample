package com.nullwelldev.login;

import org.springframework.stereotype.Service;

//Dummy user validation service method for demo purpose
//Use a correct authentication service for this
//This service can be managed by spring - using dependency injection

@Service
public class LoginService {
	public boolean isUserValid(String user, String password) {

		if (user.equals("CSD") && password.equals("CSD"))
			return true;
		
		return false;
	}
}
