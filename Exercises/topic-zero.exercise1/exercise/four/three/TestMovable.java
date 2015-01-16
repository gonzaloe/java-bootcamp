package exercise.four.three;

public class TestMovable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movable m1 = new MovablePoint(5, 6, 10, 8);     // upcast
		System.out.println(m1);
		m1.moveLeft();
		System.out.println(m1);
		   
		Movable m2 = new MovableCircle(2, 1, 2, 20, 20); // upcast
		System.out.println(m2);
		m2.moveRight();
		System.out.println(m2);
		
		Movable m3 = new MovableRectangle(8,5,40,25,5,6);
		m3.moveDown();
		System.out.println(m3);
		m3.moveLeft();
		System.out.println(m3);
	}

}
