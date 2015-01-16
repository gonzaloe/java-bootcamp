package exercise.one.thirteen;

public class Ball {
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;
	
	public Ball(int x, int y, int radius, int speed, int direction) {
		this.x = x;
		this.y = y;
		this.yDelta = (float) (-speed*Math.sin(direction));
		this.xDelta = (float) (speed*Math.cos(direction));
	}

	public void setX(float x) {
		this.x = x;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}

	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getRadius() {
		return radius;
	}

	public float getxDelta() {
		return xDelta;
	}

	public float getyDelta() {
		return yDelta;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move() {
		this.x += xDelta;
		this.y += yDelta;
	}
	
	public void reflectHorizontal() {
		xDelta = -xDelta;
	}
	
	public void reflectVertical() {
		yDelta = -yDelta;
	}
	
	public String toString() {
		return "Ball at (" + x + "," + y + ") of velocity (" + xDelta + "," + yDelta + ")";
	}
}
