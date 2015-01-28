package CRUD;

import java.util.HashMap;

public class UserService implements UserServiceInterface {
	
	private HashMap<Integer, User> userList = new HashMap<Integer, User>();
	private int userID = 0;
	
	public UserService() {
	}

	@Override
	public void createUser(String name) {
		userID++;
		User newUser = new User(name);
		userList.put(userID, newUser);
	}
	
	@Override
	public void createUser(String name, int friends) {
		userID++;
		User newUser = new User(name, friends);
		userList.put(userID, newUser);
	}

	@Override
	public String readUser(int userID) {
		return userList.get(userID).toString();
	}

	@Override
	public void updateUser(String name) {
		userList.get(userID).setName(name);
	}
	
	@Override
	public void updateUser(String name, boolean state) {
		userList.get(userID).setName(name);
		userList.get(userID).isOnline(state);
	}

	@Override
	public void deleteUser(int userID) {
		userList.remove(userID);
	}
	
	@Override
	public int getID() {
		return userID;
	}
	
	@Override
	public void addLike() {
		userList.get(userID).addLike();
	}
	
	@Override
	public void addFriend() {
		userList.get(userID).addFriend();
	}
	
}
