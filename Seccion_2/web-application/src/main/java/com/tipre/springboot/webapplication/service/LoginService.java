package com.tipre.springboot.webapplication.service;

public class LoginService {
	
	public boolean validateUser(String userId,String password) {
		
		return userId.equalsIgnoreCase("santiago") && password.equalsIgnoreCase("pirata22");
		
	}

}
