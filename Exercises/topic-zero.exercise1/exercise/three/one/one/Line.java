package exercise.three.one.one;

public class Line {
	   // A line composes of two points (as instance variables)
	   private Point begin;    // beginning point
	   private Point end;      // ending point
	   
	   // Constructors
	   public Line (Point begin, Point end) {  // caller to construct the Points
	      this.begin = begin;
	      this.end = end;
	   }
	   public Line (int beginX, int beginY, int endX, int endY) {
	      begin = new Point(beginX, beginY);   // construct the Points here
	      end = new Point(endX,endY);
	   }
	   
	   // Public methods
	   public String toString() { 
		   return "Line begins in: " + begin + " and ends in: " + end;
	   }
	   
	   public Point getBegin() { 
		   return begin;
	   }
	   
	   public Point getEnd() { 
		   return end;
	   }
	   
	   public void setBegin(int beginX, int beginY) {
		   begin = new Point(beginX,beginY);
	   }
	   
	   public void setEnd(int endX, int endY) { 
		   end = new Point(endX,endY);
	   }
	   
	   public int getBeginX() { 
		   return begin.getX();
	   }
	  
	   public int getBeginY() {
		   return begin.getY();
	   }
	   
	   public int getEndX() {
		   return end.getX();
	   }
	   
	   public int getEndY() { 
		   return end.getY();
	   }
	   
	   public void setBeginX(int beginX) {
		   this.begin.setX(beginX);
	   }
	   
	   public void setBeginY(int beginY) { 
		   this.begin.setY(beginY);
	   }
	   
	   public void setBeginXY(int beginX, int beginY) {
		   this.begin.setXY(beginX, beginY);
	   }
	   
	   public void setEndX(int endX) {
		   this.end.setX(endX);
	   }
	   
	   public void setEndY(int endY) {
		   this.end.setY(endY);
	   }
	   
	   public void setEndXY(int endX, int endY) {
		   this.end.setXY(endX, endY);
	   }
	   
	   public int getLength() {
		   double line = 0;
		   int xDiff = 0;
		   int yDiff = 0;
		   xDiff = begin.getX()-end.getX();
		   yDiff = begin.getY()-end.getY();
		   line = Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		   return (int)line;
	   } 
	                                    
	   public double getGradient() {
		   double gradient = 0;
		   int xDiff = 0;
		   int yDiff = 0;
		   xDiff = begin.getX()-end.getX();
		   yDiff = begin.getY()-end.getY();
		   gradient = Math.atan2(yDiff, xDiff);
		   return gradient;
	   } 
	                                          
	}
