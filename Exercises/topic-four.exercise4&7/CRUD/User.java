package CRUD;

public class User {
	private String name;
	private boolean state;
	private Photo photo;
	private int friends;
	
	public User(String name) {
		this.name = name;
		this.state = true;
		this.photo = new Photo();
		this.friends = 0;
	}
	
	public User(String name, int friends) {
		this.name = name;
		this.state = true;
		this.photo = new Photo();
		this.friends = friends;
	}
	
	public String toString() {
		return name + ": status-> " + ifOnline() + " friends-> " + friends + " and the photo " + photo.getImageName() + " has " + photo.getLikes() + " likes";
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void isOnline(boolean state) {
		this.state = state;
	}
	
	public String ifOnline() {
		if(state)
			return "online";
		else
			return "offline";
	}
	
	public void addLike() {
		photo.addLike();
	}
	
	public void addFriend() {
		friends++;
	}
	
}
