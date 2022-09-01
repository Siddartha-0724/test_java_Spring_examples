package com.in28minutes;

public class UserValidationService {
	
	public boolean isUserValid(String user, String password)
	{
		if(user.equals("sid")&&password.equals("mypassword"))
			return true;
		return false;
	}
}
