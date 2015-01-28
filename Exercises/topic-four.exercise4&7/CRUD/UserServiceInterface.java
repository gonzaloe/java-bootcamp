package CRUD;

public interface UserServiceInterface {
	public void createUser(String name);
	public void createUser(String name, int friends);
	public String readUser(int userID);
	public void updateUser(String user);
	public void updateUser(String user, boolean state);
	public void deleteUser(int userID);
	public void addFriend();
	public void addLike();
	public int getID();
}
