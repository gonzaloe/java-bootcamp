package exercise.four.four;

public class Circle implements GeometricObject {
	protected double radius = 1.0;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double getPerimeter() {
		double perimeter = 0;
		perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	@Override
	public double getArea() {
		double area = 0;
		area = 2*Math.PI*radius*radius;
		return area;
	}
	
	public String toString() {
		return "Circle with perimeter: " + getPerimeter() + " and area: " + getArea();
	}
}
