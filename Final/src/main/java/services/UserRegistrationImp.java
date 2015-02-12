package services;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;

import dao.User;
import demo.MySessionFactory;

public class UserRegistrationImp implements UserRegistrationAndLogin {
	
	private Session session;
	
	@Override
	public void addUser(User user) {
		try {
			session = MySessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		    session.close();
		} catch(NonUniqueObjectException exception) {
			System.out.println("The username already exists in the server");
		} catch(Exception exception) {
			System.out.println("An error ocurred trying to set a new user in the server");
		}
	}

	@Override
	public boolean login(String userName, String password) {
		try {
			session = MySessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			User user = (User) session.get(User.class, userName);
			if(user.getPassword().equals(password)) {
				System.out.println("Logged in");
				return true;
			}
			else {
				System.out.println("Wrong pass");
			}
			
		} catch(Exception exception) {
			System.out.println("An error ocurred trying to retrieve data from the server");
		}
		return false;
	}

}
