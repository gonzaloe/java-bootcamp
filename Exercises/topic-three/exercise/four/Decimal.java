package exercise.four;

public class Decimal {

	private int decimal;
	private String newDecimal;

	public Decimal(int decimal) {
		this.decimal = decimal;
		this.newDecimal = "";
	}

	public String getThousand(int thousand) {
		switch(thousand) {
		case 1:
			return "M";
		case 2:
			return "MM";
		case 3:
			return "MMM";
		default:
			return "";
		}
	}
	
	public String getHundred(int hundred) {
		switch(hundred) {
		case 1:
			return "C";
		case 2:
			return "CC";
		case 3:
			return "CCC";
		case 4:
			return "CD";
		case 5:
			return "D";
		case 6:
			return "DC";
		case 7:
			return "DCC";
		case 8:
			return "DCCC";
		case 9:
			return "CM";
		default:
				return "";
		}
	}
	
	public String getUnity(int unity) {
		switch(unity) {
		case 1:
			return "I";
		case 2:
			return "II";
		case 3:
			return "III";
		case 4:
			return "IV";
		case 5:
			return "V";
		case 6:
			return "VI";
		case 7:
			return "VII";
		case 8:
			return "VIII";
		case 9:
			return "IX";
		default:
			return "";
		}
	}
	
	public String getTen(int ten) {
		switch(ten) {
		case 1:
			return "X";
		case 2:
			return "XX";
		case 3:
			return "XXX";
		case 4:
			return "XL";
		case 5:
			return "L";
		case 6:
			return "LX";
		case 7:
			return "LXX";
		case 8:
			return "LXXX";
		case 9:
			return "XC";
		default:
			return "";
		}
	}
	
	public String convertToRoman() {
		newDecimal += getThousand(decimal/1000);
		newDecimal += getHundred((decimal/100)%10);
		newDecimal += getTen((decimal/10)%100);
		newDecimal += getUnity(decimal%10);
		return newDecimal;
	}

}
