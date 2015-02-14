package services;

import model.User;

public interface UserRegistration {
	public void addUser(User user);	
	public boolean login(String userName, String password);
}
