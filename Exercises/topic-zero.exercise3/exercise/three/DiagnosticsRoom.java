package exercise.three;

public class DiagnosticsRoom implements RoomBuilder {
	public Room diagRoom;
	
	public DiagnosticsRoom() {
		diagRoom = new Room();
	}
	
	@Override
	public void setaType() {
		diagRoom.setType("Diagnostics");
	}
	@Override
	public void setAnExtension() {
		diagRoom.setExtension(5.0);
	}
	@Override
	public void setaCapacity() {
		diagRoom.setCapacity(3);
	}
	@Override
	public Room getRoom() {
		return diagRoom;
	}
}
