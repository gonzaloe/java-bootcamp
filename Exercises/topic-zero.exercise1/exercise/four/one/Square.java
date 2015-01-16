package exercise.four.one;

public class Square extends Rectangle {
	public Square() {
		super(1.0,1.0);
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side, side);
		this.color = color;
		this.filled = filled;
	}
	
	public double getSide() {
		double side = 0;
		side = getWidth();
		return side;
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	public void setLength(double side) {
		super.setLength(side);
	}
	
	public double getArea() {
		double area = 0;
		area = getWidth()*getWidth();
		return area;
	}
	
	public double getPerimeter() {
		double perimeter = 0;
		perimeter = (4*getWidth());
		return perimeter;
	}
	
	public String toString() {
		return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
	}
}
