package shopping.cart.exerciseone;

import java.util.ArrayList;
import java.util.List;

public class Mail {
	
	private List<Mail> mailList = new ArrayList<Mail>();
	
	private boolean Offer;
	private boolean Price;
	private boolean Transaction;
	
	public Mail() {
		this.Offer = false;
		this.Price = false;
		this.Transaction = false;
	}
	
	public void setOffer(boolean Offer) {
		this.Offer = Offer;
		notifyMail();
	}
	public void setPrice(boolean Price) {
		this.Price = Price;
		notifyMail();
	}
	public void setTransaction(boolean Transaction) {
		this.Transaction = Transaction;
		notifyMail();
	}
	
	public void sendNotif() {
		mailList.add(this);
		notifyMail();
	}
	
	public void notifyMail() {
		if(Offer)
			System.out.println("A new offer/item has been added");
		if(Price)
			System.out.println("A price was changed");
		if(Transaction)
			System.out.println("A new transaction has been made");
	}
		
}
