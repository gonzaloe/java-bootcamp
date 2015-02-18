package services;

import java.util.List;

import org.hibernate.HibernateException;

import model.Product;

public interface ProductRegistration {
	public void addProduct(Product product);
	public boolean retireProduct(Product product, int qty);
	public List<Product> getProductByType(String type) throws HibernateException;
	public List<Product> getProductByName(String name) throws HibernateException;
}
