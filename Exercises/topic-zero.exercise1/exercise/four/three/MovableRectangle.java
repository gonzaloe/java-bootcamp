package exercise.four.three;

public class MovableRectangle implements Movable {
	public MovablePoint topLeft;
	public MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
		bottomRight = new MovablePoint(x1,y1,xSpeed,ySpeed);
	}
	
	public String toString() {
		return "Moved to (" + topLeft.x + "," + bottomRight.x + "," + topLeft.y + "," + bottomRight.y + ")";  
	}
	
	public void moveDown() {
		topLeft.y += topLeft.ySpeed;
		bottomRight.y += topLeft.ySpeed;
	}
	@Override
	public void moveUp() {
		topLeft.y -= topLeft.ySpeed;
		bottomRight.y -= topLeft.ySpeed;
	}
	@Override
	public void moveLeft() {
		topLeft.x -= topLeft.xSpeed;
		bottomRight.x -= topLeft.xSpeed;
	}
	@Override
	public void moveRight() {
		topLeft.x += topLeft.xSpeed;
		bottomRight.x += topLeft.xSpeed;
	}
}
