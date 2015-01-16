package exercise.one.three;

public class MyPoint {
	private int x;
	private int y;
	
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public int getX() {
		return x;
	}

	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	public int distance(int x, int y) {
		int distance = 0;
		distance = Math.abs(this.x-x);
		distance += Math.abs(this.y-y);
		
		return distance;
	}
	
	public int distance(MyPoint another) {
		int distance = 0;
		distance = Math.abs(this.x-another.getX());
		distance += Math.abs(this.y-another.getY());
		return distance;
	}
}
