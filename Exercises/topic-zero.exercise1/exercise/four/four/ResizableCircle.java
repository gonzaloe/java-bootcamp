package exercise.four.four;

public class ResizableCircle extends Circle implements Resizable {
	public ResizableCircle(double radius) {
		super(radius);
	}
	
	public void resize(int percent) {
		double newsize = 0;
		newsize = ((double)percent)*radius/100;
		System.out.println(newsize);
	}
}
