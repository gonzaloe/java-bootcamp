package exercise.one;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner intro = new Scanner(System.in);
		System.out.print("Please input the amount to convert: ");
		double amount = intro.nextDouble();
		AmountConverter amountConverter = new AmountConverter(amount);
		System.out.println(amountConverter.toString());
		intro.close();
				
	}

}
