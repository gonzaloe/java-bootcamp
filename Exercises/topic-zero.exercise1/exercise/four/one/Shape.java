package exercise.four.one;

public abstract class Shape {
	protected String color = "red";
	protected boolean filled = true;
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public Shape() {
		this.color = "green";
		this.filled = true;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getColor() {
		return color;
	}
	public boolean isFilled() {
		return filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	public String toString() {
		if(filled)
			return "A Shape with color of " + color + " and filled";
		else
			return "A Shape with color of " + color + " and not filled";
	}
}
