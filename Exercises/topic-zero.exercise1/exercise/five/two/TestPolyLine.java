package exercise.five.two;

public class TestPolyLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolyLine l1 = new PolyLine();
	      System.out.println(l1);    // empty
	      l1.appendPoint(new Point(1, 1));
	      l1.appendPoint(2, 2);
	      l1.appendPoint(3, 3);
	      System.out.println(l1);    // (1,1)(2,2)(3,3)
	}

}
