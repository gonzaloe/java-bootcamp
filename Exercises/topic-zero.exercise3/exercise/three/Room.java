package exercise.three;

public class Room {
	private String type;
	private int capacity;
	private double extension;
	
	public void setType(String type) {
		this.type = type;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public void setExtension(double extension) {
		this.extension = extension;
	}
	
	public String getType() {
		return type;
	}
	public int getCapacity() {
		return capacity;
	}
	public double getExtension() {
		return extension;
	}
	
	public String toString() {
		return "Room for: " + type + " with an extension of " + extension + "m2, and with a capacity for: " + capacity + " people";
	}
}
