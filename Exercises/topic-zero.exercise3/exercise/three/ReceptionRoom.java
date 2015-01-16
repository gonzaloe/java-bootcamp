package exercise.three;

public class ReceptionRoom implements RoomBuilder {
	public Room recRoom;
	
	public ReceptionRoom() {
		recRoom = new Room();
	}
	
	@Override
	public void setaType() {
		recRoom.setType("Receptions");
	}
	@Override
	public void setAnExtension() {
		recRoom.setExtension(7.0);
	}
	@Override
	public void setaCapacity() {
		recRoom.setCapacity(25);
	}
	@Override
	public Room getRoom() {
		return recRoom;
	}
}
