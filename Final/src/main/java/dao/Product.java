package dao;


public class Product implements ProductBuilder {

	private String type;
	private double price;
	private int qtyAvailable;
	
	
	public Product(String type, double price, int qtyAvailable) {
		this.type = type;
		this.price = price;
		this.qtyAvailable = qtyAvailable;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQtyAvailable() {
		return qtyAvailable;
	}
	public void setQtyAvailable(int qtyAvailable) {
		this.qtyAvailable = qtyAvailable;
	}

	@Override
	public void addQty(int qty) {
		this.qtyAvailable = qty;
	}

	@Override
	public int retireQty(int qty) {
		this.qtyAvailable = qtyAvailable - qty;
		return this.qtyAvailable;
	}

	@Override
	public Product getProduct() {
		return this;
	}
	
	
}
