package services;

import model.Product;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;

import demo.MySessionFactory;

public class CartRegistrationImp implements CartRegistration {

Session session;
	
	@Override
	public void addProduct(Product product) {
		try {
			session = MySessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(product);
			session.getTransaction().commit();
		    session.close();
		} catch(NonUniqueObjectException exception) {
			System.out.println("This product already exists in the server");
		} catch(Exception exception) {
			System.out.println("An error ocurred trying to set a new product in the server");
		}
	}

}
