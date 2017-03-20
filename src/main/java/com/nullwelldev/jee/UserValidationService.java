package com.nullwelldev.jee;

//Dummy user validation service method for demo purpose
//Use a correct authentication service for this
public class UserValidationService {
	public boolean isUserValid(String user, String password) {

		if (user.equals("CSD") && password.equals("CSD"))
			return true;
		
		return false;
	}
}
