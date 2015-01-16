package exercise.one.four;

public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public MyCircle(MyPoint center, int radius) {
		this.center = center;
		this.radius = radius;
	}

	public void setCenter(MyPoint center) {
		this.center = center;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public MyPoint getCenter() {
		return center;
	}

	public int getRadius() {
		return radius;
	}
	
	public String toString() {
		return "Circle @ " + center.toString() + " radius " + radius;
	}
	
	public double getArea() {
		double area = 0;
		area = Math.PI*Math.pow(area, 2.0);
		return area;
	}
}
