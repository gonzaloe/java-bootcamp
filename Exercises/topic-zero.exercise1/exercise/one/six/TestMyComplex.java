package exercise.one.six;

import java.util.Scanner;

public class TestMyComplex {


	
	private static Scanner s1;

	public static void main(String[] args) {
		
		
		double complex1 = 0;
		double complex2 = 0;
		
		s1 = new Scanner(System.in);
		
		
		System.out.print("Enter complex number 1 (real and imaginary part): ");
		complex1 = s1.nextDouble();
		complex2 = s1.nextDouble();
		MyComplex c1 = new MyComplex(complex1, complex2);
		
		System.out.println("");
		System.out.print("Enter complex number 2 (real and imaginary part): ");
		complex1 = s1.nextDouble();
		complex2 = s1.nextDouble();
		MyComplex c2 = new MyComplex(complex1,complex2);
		
		System.out.println();
		System.out.println("Number 1 is: " + c1.toString());
		if(c1.isReal())
			System.out.println(c1.toString() + " is a pure real number");
		else
			System.out.println(c1.toString() + " is not a pure real number");
		if(c1.isImaginary())
			System.out.println(c1.toString() + " is a pure imaginary number");
		else
			System.out.println(c1.toString() + " is not a pure imaginary number");

		System.out.println();
		System.out.println("Number 2 is: " + c2.toString());
		if(c2.isReal())
			System.out.println(c2.toString() + " is a pure real number");
		else
			System.out.println(c2.toString() + " is not a pure real number");
		if(c2.isImaginary())
			System.out.println(c2.toString() + " is a pure imaginary number");
		else
			System.out.println(c2.toString() + " is not a pure imaginary number");
		
		System.out.println();
		if(c1.equals(c2)) 
			System.out.println(c1.toString() + " equals to " + c2.toString());
		else
			System.out.println(c1.toString() + " is NOT equal to " + c2.toString());
		
		System.out.println();
		System.out.println(c1.toString() + " + " + c2.toString() + " = " + c1.add(c2));
		
		System.out.println();
		System.out.println(c1.toString() + " - " + c2.toString() + " = " + c1.subtract(c2));
		
		System.out.println();
		System.out.println(c1.toString() + " * " + c2.toString() + " = " + c1.multiplyWith(c2));
		
		System.out.println();
		System.out.println(c1.toString() + " / " + c2.toString() + " = " + c1.divideBy(c2));
	}

}
