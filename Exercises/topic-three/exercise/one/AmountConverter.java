package exercise.one;

public class AmountConverter {

	private int amount;
	private int decimals;
	private double valor;
	double aux;

	public AmountConverter(double valor) {
		this.valor = valor;
		this.amount = (int) valor;
		aux = valor*100;
		this.decimals = (int)(aux%100);
	}
	
	public String convert() {
		return setBillion(this.amount);
	}

	public String getUnity(int amount) {
		switch(amount) {
		case 1:
			return " one";
		case 2:
			return " two";
		case 3:
			return " three";
		case 4:
			return " four";
		case 5:
			return " five";
		case 6:
			return " six";
		case 7:
			return " seven";
		case 8:
			return " eight";
		case 9:
			return " nine";
		default:
			return "";
		}
	}

	public String getDecimals() {
		return " and " + decimals + "/100 dollars";
	}

	public String getTen(int amount) {
		switch(amount/10) {
		case 1:
			return setTen(amount);
		case 2:
			return " twenty -" + getUnity(amount-20);
		case 3:
			return " thirty -" + getUnity(amount-30) ;
		case 4:
			return " forty -" + getUnity(amount-40);
		case 5:
			return " fifty -" + getUnity(amount-50);
		case 6:
			return " sixty -" + getUnity(amount-60);
		case 7:
			return " seventy -" + getUnity(amount-70);
		case 8:
			return " eighty -" + getUnity(amount-80);
		case 9:			
			return " ninety -" + getUnity(amount-90);
		default:
			return "";
		}
	}
	
	public String setTen(int amount) {
		switch(amount) {
		case 10:
			return " ten";
		case 11:
			return " eleven";
		case 12:
			return " twelve";
		case 13:
			return " thirteen";
		case 14:
			return " fourteen";
		case 15:
			return " fifteen";
		case 16:
			return " sixteen";
		case 17:
			return " seventeen";
		case 18:
			return " eighteen";
		case 19:
			return " nineteen";
		default:
			return "";
		}
	}

	public String setBillion(int amount) {
		if(amount>=1000000000)
			return getUnity(amount/1000000000) + " billion"+ setMillion(amount%1000000000);
		else
			return setMillion(amount);
	}
	
	public String setMillion(int amount) {
		if(amount >= 1000000 && amount <= 9999999)
			return getUnity(amount/1000000) + " million" + setThousand(amount%1000000);
		else if(amount >= 10000000 && amount <= 99999999)
			return getTen(amount/1000000) + " million"  + setThousand(amount%10000000);
		else if(amount >= 100000000 && amount <= 999999999)
			return getUnity(amount/100000000) + " hundred" + getTen((amount%100000000)/10000000) + " million" + setThousand(amount%1000000);
		else
			return setThousand(amount);
	}
	
	public String setThousand(int amount) {
		if(amount >= 1000 && amount <= 9999)
			return getUnity(amount/1000) + " thousand" + setHundred(amount%1000);
		else if(amount >= 10000 && amount <= 99999)
			return getTen(amount/1000) + " thousand" + setHundred(amount%1000);
		else if(amount >= 100000 && amount <= 999999)
			return getUnity(amount/100000) + " hundred" + getTen((amount%100000)/1000) + " thousand" + setHundred(amount%1000);
		else
			return setHundred(amount);
	}
	
	public String setHundred(int amount) {
		if(amount >= 110 && amount <= 999) 
			return getUnity(amount/100) + " hundred" + getTen(amount%100);
		else if (amount >= 100 && amount <= 109)
			return getUnity(amount/100) + " hundred" + getUnity(amount%100);
		else if (amount >=10 && amount <=99)
			return getTen(amount);
		else
			return getUnity(amount);
	}

	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return valor + " --> " + convert() + getDecimals();
	}
}
