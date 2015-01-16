package shopping.cart.exerciseone;

public class Product {
	private String type;
	private int qtyAvailable;
	private double price;
	private int qtyPurchased;
	
	public Product(String type, int qtyAvailable, double price) {
		this.type = type;
		this.qtyAvailable = qtyAvailable;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}
	public int getQtyAvailable() {
		return qtyAvailable;
	}
	public double returnPrice() {
		return price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setQtyAvailable(int qtyAvailable) {
		this.qtyAvailable = qtyAvailable;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void minusQty(int qty) {
		this.qtyAvailable -= qty;
		qtyPurchased = qty;
	}
	
	public void plusQty(int qty) {
		this.qtyAvailable += qty;
	}
	
	public double applyForOffer(String type) {
		InOffer offer = new InOffer();
		double subtotal = 0;
		subtotal = price - (offer.getOfferPrice(type)*price);
		subtotal = price*qtyPurchased;
		return subtotal;
	}
	
	public String toString() {
		return type + ": \tPrice per unit-> $" + price + " \tAvailable quantity-> " + qtyAvailable; 
	}
	
}
