package services;

import model.Product;

public interface ProductRegistration {
	public void addProduct(Product product);
	public void retireProduct(Product product, int qty);
	public Product getProduct();
}
