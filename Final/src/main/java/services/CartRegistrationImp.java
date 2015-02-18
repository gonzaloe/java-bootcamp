package services;

import model.Cart;
import model.Product;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;

import demo.MySessionFactory;

public class CartRegistrationImp implements CartRegistration {

Session session;
	
	@Override
	public void addProduct(String user, Product product) {
		try {
			Cart cart = new Cart();
			cart.setUserID(user);
			cart.setProduct(product);
			session = MySessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.save(cart);
			session.getTransaction().commit();
		    session.close();
		} catch(NonUniqueObjectException exception) {
			System.out.println("This cart already exists in the server");
		} catch(Exception exception) {
			System.out.println("An error ocurred trying to set a new cart in the server");
		}
	}

}
