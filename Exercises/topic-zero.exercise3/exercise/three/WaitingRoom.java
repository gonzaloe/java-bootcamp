package exercise.three;

public class WaitingRoom implements RoomBuilder {
	public Room waitRoom;
	
	public WaitingRoom() {
		waitRoom = new Room();
	}
	
	@Override
	public void setaType() {
		waitRoom.setType("Waiting for turns");
	}
	@Override
	public void setAnExtension() {
		waitRoom.setExtension(10);
	}
	@Override
	public void setaCapacity() {
		waitRoom.setCapacity(80);
	}
	@Override
	public Room getRoom() {
		return waitRoom;
	}
}
