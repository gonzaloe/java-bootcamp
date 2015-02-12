package dao;

import javax.persistence.Entity;

@Entity
public interface ProductBuilder {
	public void addQty(int qty);
	public int retireQty(int qty);
	public Product getProduct();
}
