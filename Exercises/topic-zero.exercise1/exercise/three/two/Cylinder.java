package exercise.three.two;

public class Cylinder {  //save as "Cylinder.java"
	   private double height;  // private variable
	   private Circle base;
	   // Constructor with default color, radius and height
	   public Cylinder() {
		  base = new Circle(); 
	      height = 1.0; 
	   }
	   // Constructor with default radius, color but given height
	   public Cylinder(double height) {
	      base = new Circle();
	      this.height = height;
	   }
	   // Constructor with default color, but given radius, height
	   public Cylinder(double radius, double height) {
	      base = new Circle(radius);
	      this.height = height;
	   }
	   
	   // A public method for retrieving the height
	   public double getHeight() {
	      return height; 
	   }
	  
	   // A public method for computing the volume of cylinder
	   //  use superclass method getArea() to get the base area
	   public double getVolume() {
	      return getArea()*height; 
	   }
	   
	   public double getRadius() {
		   return base.getRadius();
	   }
	   
	   public double getArea() {
		   return base.getRadius()*base.getRadius()*Math.PI*height;
	   }
	}
