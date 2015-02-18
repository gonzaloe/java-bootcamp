package services;

import model.User;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import demo.MySessionFactory;

@Service
public class UserRegistrationImp implements UserRegistration {
	
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
	public String login(String userName, String password) {
		String login = null;
		try {
			session = MySessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			User user = (User) session.get(User.class, userName);
			if(user.getPassword().equals(password)) {
				login = "Logged in";
			}
			else {
				login = "Wrong password";
			}
			
		} catch(Exception exception) {
			System.out.println("An error ocurred trying to retrieve data from the server");
		}
		return login;
	}

}
