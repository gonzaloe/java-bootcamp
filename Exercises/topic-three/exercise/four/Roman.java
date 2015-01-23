package exercise.four;

public class Roman {

	private int total;
	private char[] chain;
	
	public Roman(String string) {
		total = 0;
		this.chain = string.toCharArray();
	}

	public int getValue(char position) {
		switch(position) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
	
	public int convertToDecimal()
	{
		 int decimal[]=new int [chain.length];
		 int nextNumber = 0;
		 int number = 0;
		 
		 for(int i=0; i<chain.length; i++)
		 {
		 	decimal[i]= getValue(chain[i]);
		 }
		 if(chain.length % 2 == 0)
		 {
		 	for(int i=0; i<chain.length; i=i+2)
		 	{
		 		number = decimal[i];
		 		nextNumber = decimal[i+1];
		 		if(number>=nextNumber)
		 			total += number + nextNumber;
		 		else
		 			total += nextNumber - number;
		 	}	
		 }
		 else {
		 	for(int i=chain.length-1; i>0; i=i-2)
		 	{
		 		number = decimal[i];
		 		nextNumber = decimal[i-1];
		 		if(number> nextNumber)
		 			total += number - nextNumber;
		 		else
		 			total += nextNumber+number;
		 	} 
		 	number = decimal[0];
		 	total += number;
		 }
		 
		 return total;
	}
}
