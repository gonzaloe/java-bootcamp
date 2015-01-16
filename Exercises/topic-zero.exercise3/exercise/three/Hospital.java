package exercise.three;

public class Hospital {
	private RoomBuilder roombuilder = null;
	
	public Hospital(RoomBuilder roombuilder) {
		this.roombuilder = roombuilder;
	}
	
	public void construcRoom() {
		roombuilder.setaCapacity();
		roombuilder.setAnExtension();
		roombuilder.setaType();
	}
	
	public Room getRoom() {
		return roombuilder.getRoom();
	}
}
