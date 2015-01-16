package exercise.two;

public class House {
	private String room;
	private double backyard;
	private double kitchen;
	private String bathroom;
	private double livingroom;
	
	public void setRoom(String room, double extension) {
		this.room = room + " with " + extension;
	}
	public void setBackyard(double backyard) {
		this.backyard = backyard;
	}
	public void setKitchen(double kitchen) {
		this.kitchen = kitchen;
	}
	public void setBathroom(String bathroom, double extension) {
		this.bathroom = bathroom + " with " + extension;
	}
	public void setLivingroom(double livingroom) {
		this.livingroom = livingroom;
	}
	
	public String getRoom() {
		return room;
	}
	public double getBackyard() {
		return backyard;
	}
	public double getKitchen() {
		return kitchen;
	}
	public String getBathroom() {
		return bathroom;
	}
	public double getLivingroom() {
		return livingroom;
	}
	
	public String toString() {
		return "A house with rooms: " + room + "m2 per unit" + ", a backyard with: " + backyard + "m2, bathroom: " + bathroom + "m2 per unit, a kitchen with " + kitchen + "m2, and a livingroom with " + livingroom + "m2";
	}
}
