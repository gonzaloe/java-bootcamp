package exercise.one.five;

public class MyTriangle {
	private MyPoint v1, v2, v3;
	
	public MyTriangle(){
		v1 = new MyPoint(5,7);
		v2 = new MyPoint(10,10);
		v3 = new MyPoint(4,6);
	}
	
	public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
		this.v1 = v1;
		this.v2 = v2;
		this.v3 = v3;
	}
	
	public String toString() {
		return "Triangle @ " + v1 + ", " + v2 + ", " + v3;
	}
	
	public double getPerimeter() {
		double perimeter = 0;
		perimeter += v1.distance(v2);
		perimeter += v1.distance(v3);
		perimeter += v2.distance(v3);
		return perimeter;
	}
	
	public void printType() {
		if((v1.distance(v2) == v1.distance(v3)) && (v2.distance(v1) == v2.distance(v3))) {
			System.out.println("Triangle is equilateral");
		}
		else if(v1.distance(v2) == v1.distance(v3) || (v2.distance(v1) == v2.distance(v3))) {
			System.out.println("Triangle is isosceles");
		}
		else if(v3.distance(v2) == v3.distance(v1)) {
			System.out.println("Triangle is isosceles");
		}
		else {
			System.out.println("Triangle is scalene");
		}
	}

}
