package shopping.cart.exerciseone;

public class Apples extends Product implements ProductBuilder {
	public Apples(int qtyAvailable, double price) {
		super("Apples",qtyAvailable,price);
	}
	
	@Override
	public void addQty(int qty) {
		plusQty(qty); 
	}
	@Override
	public double retireQty(int qty) {
		double subtotal = 0;
		minusQty(qty);
		subtotal = applyForOffer(getType());
		return subtotal;
	}
	@Override
	public Product getProduct() {
		return this;
	}
	@Override 
	public int getQty() {
		return getQtyAvailable();
	}
	@Override
	public double getPrice() {
		return returnPrice();
	}
}
