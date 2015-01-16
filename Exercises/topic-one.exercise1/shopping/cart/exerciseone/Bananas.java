package shopping.cart.exerciseone;

public class Bananas extends Product implements ProductBuilder {
		
	public Bananas(int qtyAvailable, double price) {
		super("Bananas",qtyAvailable,price);
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
