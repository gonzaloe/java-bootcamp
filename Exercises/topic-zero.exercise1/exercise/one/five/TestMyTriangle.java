package exercise.one.five;

public class TestMyTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint v1 = new MyPoint(0,5);
		MyPoint v2 = new MyPoint(0,10);
		MyPoint v3 = new MyPoint(5,5);
		
		MyTriangle t1 = new MyTriangle(v1,v2,v3);
		MyTriangle t2 = new MyTriangle();
		
		t1.printType();
		t2.printType();
	}

}
