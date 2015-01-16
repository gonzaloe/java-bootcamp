package exercise.four.four;

public class TestCircleandResizableCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricObject c1 = new Circle(5.0);
		System.out.println(c1);
		
		ResizableCircle c2 = new ResizableCircle(5.0);
		c2.resize(50);
		System.out.println();
	}

}
