package exercise.four.one;

public class Circle extends Shape {
	private double radius = 1.0;
	
	public Circle() {
		this.radius = 1.0;
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color, boolean filled) {
		this.radius = radius;
		this.color = color;
		this.filled = filled;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		double area = 0;
		area = 2*Math.PI*radius*radius;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 0;
		perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	public String toString() {
		return "A Circle with radius " + radius + " wich is a subclass of " + super.toString();
	}
}
