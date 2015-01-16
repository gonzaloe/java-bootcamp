package exercise.three;

public class IntensiveCareRoom implements RoomBuilder {
	public Room intRoom;
	
	public IntensiveCareRoom() {
		intRoom = new Room();
	}
	
	@Override
	public void setaType() {
		intRoom.setType("Clinics and Intensive Care");
	}
	@Override
	public void setAnExtension() {
		intRoom.setExtension(7.5);
	}
	@Override
	public void setaCapacity() {
		intRoom.setCapacity(5);
	}
	@Override
	public Room getRoom() {
		return intRoom;
	}
}
