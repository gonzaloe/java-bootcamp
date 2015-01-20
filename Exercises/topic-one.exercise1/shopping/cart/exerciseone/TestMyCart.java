package shopping.cart.exerciseone;


public class TestMyCart {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductBuilder b1 = new Bananas(500,2.0);
		ProductsList l1 = new ProductsList();
		Mail m1 = new Mail();
		l1.addProduct(b1);
		b1 = new StrawBerries(100,5.0);
		l1.addProduct(b1);
		m1.setOffer(true);
		b1 = new Apples(350,3.0);
		m1.setOffer(true);
		l1.addProduct(b1);
		b1 = new Oranges(700,1.0);
		m1.setOffer(true);
		l1.addProduct(b1);
		Transaction t1 = new Transaction(l1);
		m1.setTransaction(true);
		t1.onWork();
		
		AudioInterface i1 = new AudioInterface();
		i1.setVisible(true);

	}
}
