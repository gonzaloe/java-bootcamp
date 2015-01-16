package exercise.three.one.two;

public class LineSub extends Point {
	   // A line needs two points: begin and end.
	   // The begin point is inherited from its superclass Point.
	   // Private variables
	   Point end;               // Ending point
	   
	   // Constructors
	   public LineSub (int beginX, int beginY, int endX, int endY) {
	      super(beginX, beginY);             // construct the begin Point
	      this.end = new Point(endX, endY);  // construct the end Point
	   }
	   public LineSub (Point begin, Point end) {  // caller to construct the Points
	      super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
	      this.end = end;
	   }
	   
	   // Public methods
	   // Inherits methods getX() and getY() from superclass Point
	   public String toString() { 
		   return "Line begins in: " + super.toString() + " and ends in: " + end;
	   }
	   
	   public Point getBegin() { 
		   return new Point(getX(),getY());
	   }
	   
	   public Point getEnd() { 
		   return end;
	   }
	   
	   public void setBegin(int beginX, int beginY) {
		   super.setXY(beginX, beginY);
	   }
	   
	   public void setEnd(int endX, int endY) { 
		   end.setXY(endX, endY);
	   }
	   
	   public int getBeginX() { 
		   return super.getX();
	   }
	   
	   public int getBeginY() { 
		   return super.getY();
	   }
	   
	   public int getEndX() { 
		   return end.getX();
	   }
	   
	   public int getEndY() { 
		   return end.getY();
	   }
	   
	   public void setBeginX(int beginX) { 
		   super.setX(beginX);
	   }
	   
	   public void setBeginY(int beginY) { 
		   super.setY(beginY);
	   }
	   
	   public void setBeginXY(int beginX, int beginY) { 
		   super.setXY(beginX, beginY);
	   }
	   
	   public void setEndX(int endX) { 
		   end.setX(endX);
	   }
	   
	   public void setEndY(int endY) { 
		   end.setY(endY);
	   }
	   
	   public void setEndXY(int endX, int endY) { 
		   end.setXY(endX, endY);
	   }
	   
	   public int getLength() { 
		   double line = 0;
		   int xDiff = 0;
		   int yDiff = 0;
		   xDiff = super.getX()-end.getX();
		   yDiff = super.getY()-end.getY();
		   line = Math.sqrt(xDiff*xDiff + yDiff*yDiff);
		   return (int)line;
	   }       // Length of the line
	   
	   public double getGradient() { 
		   double gradient = 0;
		   int xDiff = 0;
		   int yDiff = 0;
		   xDiff = super.getX()-end.getX();
		   yDiff = super.getY()-end.getY();
		   gradient = Math.atan2(yDiff, xDiff);
		   return gradient;
	   }  // Gradient in radians
	}
