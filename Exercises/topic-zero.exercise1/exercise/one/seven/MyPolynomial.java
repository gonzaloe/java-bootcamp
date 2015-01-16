package exercise.one.seven;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyPolynomial {
	private double[] coeffs;

	public MyPolynomial(double... coeffs) {
		this.coeffs = coeffs;
	}
	
	public MyPolynomial(String filename) {
		Scanner in = null;
		   try {
		      in = new Scanner(new File(filename));  // open file
		   } catch (FileNotFoundException e) {
		      e.printStackTrace();
		   }
		   int degree = in.nextInt();      // read the degree
		   coeffs = new double[degree+1];  // allocate the array
		   for (int i=0; i<coeffs.length; ++i) {
		      coeffs[i] = in.nextDouble();
		}
	}
	
	public int getDegree() {
		return coeffs.length-1;
	}

	public String toString() {
		int i = coeffs.length-1;
		String primero = "" + coeffs[i];
		String cadena = "";
		for( i=coeffs.length-2; i>=0; i--){
			cadena += "x^" + (i+1) + "+" + coeffs[i];
		}
	    return primero + cadena;
	}


	public double evaluate(double x) {
		double suma = 0;
		for(int i=0;i<coeffs.length;i++) {
			suma += coeffs[i]*Math.pow(x, i);
		}
		return suma;
	}

	public MyPolynomial add(MyPolynomial another) {
		double[] vec = new double[coeffs.length];
		for(int i=0;i<coeffs.length;i++){
			vec[i] = coeffs[i]+another.coeffs[i];
		}
		return new MyPolynomial(vec);
	}
	

	public MyPolynomial multiply(MyPolynomial another) {
		double[] vec2 = new double[coeffs.length];
		for(int i=0;i<coeffs.length;i++){
			vec2[i] = coeffs[i]*another.coeffs[i];
		}
		return new MyPolynomial(vec2);
		
	}

}

