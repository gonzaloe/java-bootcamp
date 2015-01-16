package shopping.cart.exerciseone;

public class TransactionId {
	private static int[] cashPayment = new int[10];
	private static int[] paypalPayment = new int[10];
	private static int[] creditCardPayment = new int[10];
	private static int index1;
	private static int index2;
	private static int index3;
	
	public String addCash(){
		String cash = "";
		cashPayment[index1]++;
		if(cashPayment[index1]>9) {
			cashPayment[index1] = 0;
			index1++;
		}
		for(int i = 9; i>=0;i--) {
			cash += cashPayment[i] + " ";
		}
		return cash;
	}
	
	public String addPaypal() {
		String cash = "";
		paypalPayment[index2]++;
		if(paypalPayment[index2]>9) {
			paypalPayment[index2] = 0;
			index2++;
		}
		for(int i = 9; i>=0;i--) {
			cash += paypalPayment[i] + " ";
		}
		return cash;
	}
	
	public String addCredit() {
		String cash = "";
		creditCardPayment[index3]++;
		if(creditCardPayment[index3]>9) {
			creditCardPayment[index3] = 0;
			index3++;
		}
		for(int i = 9; i>=0;i--) {
			cash += creditCardPayment[i] + " ";
		}
		return cash;
	}
	
}
