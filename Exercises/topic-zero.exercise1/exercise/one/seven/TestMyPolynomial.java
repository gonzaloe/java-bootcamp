package exercise.one.seven;

public class TestMyPolynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
		MyPolynomial p2 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
		
		double[] coeffs = {1.2, 3.4, 5.6, 7.8};
		MyPolynomial p3 = new MyPolynomial(coeffs);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		System.out.println(p3.add(p2));
		System.out.println(p3.multiply(p2));
	}

}
