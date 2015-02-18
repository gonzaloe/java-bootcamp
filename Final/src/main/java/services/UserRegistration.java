package services;

import model.User;

public interface UserRegistration {
	public void addUser(User user);	
	public String login(String userName, String password);
}
