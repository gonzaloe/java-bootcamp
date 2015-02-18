package services;

import java.util.List;

import model.Product;

import org.hibernate.HibernateException;
import org.hibernate.NonUniqueObjectException;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

import demo.MySessionFactory;

@Service
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
	public boolean retireProduct(Product product, int qty) {
		boolean transaction = false;
		try {
			int qtyAfterRetire = 0;
			if(product.getQtyAvailable()>qty) {
				qtyAfterRetire = product.getQtyAvailable() - qty;
				product.setQtyAvailable(qtyAfterRetire);
				transaction = true;
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
		return transaction;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductByType(String type) throws HibernateException {
		List<Product> prodList = null;
		try {
			session = MySessionFactory.getSessionFactory().openSession();
			prodList = session.createQuery("from Product p where p.type='" + type + "'").list();
		}
		finally {
			session.close();
		}
		return prodList;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getProductByName(String name) throws HibernateException {
		List<Product> prodList = null;
		try {
			session = MySessionFactory.getSessionFactory().openSession();
			prodList = session.createQuery("from Product p where p.productID='" + name + "'").list();
		}
		finally {
			session.close();
		}
		return prodList;
	}
}
