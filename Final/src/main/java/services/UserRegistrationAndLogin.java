package services;

import dao.User;

public interface UserRegistrationAndLogin {
	public void addUser(User user);	
	public boolean login(String userName, String password);
}
