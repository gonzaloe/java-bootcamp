package exercise.three.one.one;

public class TestLine {
	   
	public static void main(String[] args) {
	      Line l1 = new Line(0, 0, 3, 4);
	      System.out.println(l1);
	   
	      Point p1 = new Point(100,10);
	      Point p2 = new Point(50,20);
	      Line l2 = new Line(p1, p2);
	      System.out.println(l2);
	   }
}
