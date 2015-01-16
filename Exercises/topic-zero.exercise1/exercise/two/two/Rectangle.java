package exercise.two.two;

public class Rectangle extends Shape {
	private double width = 1.0;
	private double length = 1.0;
	
	public Rectangle() {
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String color, boolean filled) {
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public double getLength() {
		return length;
	}
	
	public double getArea() {
		double area = 0;
		area = width*length;
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 0;
		perimeter = (2*width)+(2*length);
		return perimeter;
	}
	
	public String toString() {
		return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
	}
}
