package services;

import model.Product;

import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;

import demo.MySessionFactory;

public class ProductRegistrationImp implements ProductRegistration {
	
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

	@Override
	public void retireProduct(Product product, int qty) {
		try {
			int qtyAfterRetire = 0;
			if(product.getQtyAvailable()>qty) {
				qtyAfterRetire = product.getQtyAvailable() - qty;
				product.setQtyAvailable(qtyAfterRetire);
			}
			else {
				qtyAfterRetire = 1/0;
			}
			session = MySessionFactory.getSessionFactory().openSession();
			session.beginTransaction();
			session.update(product);
			session.getTransaction().commit();
			session.close();
		} catch (Exception exc) {
			System.out.println("An error ocurred while trying to retrieve the product");
		}
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
