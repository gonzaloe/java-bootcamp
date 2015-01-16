package shopping.cart.exerciseone;

public interface ProductBuilder {
	public void addQty(int qty);
	public double retireQty(int qty);
	public int getQty();
	public double getPrice();
	
	public Product getProduct();
}
