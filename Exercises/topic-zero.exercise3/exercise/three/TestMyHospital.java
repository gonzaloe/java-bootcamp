package exercise.three;

public class TestMyHospital {
	
	public static void main(String[] args) {
	RoomBuilder roomBuilder = new DiagnosticsRoom();
	Hospital hospital = new Hospital(roomBuilder);
	hospital.construcRoom();
	Room room = hospital.getRoom();
	System.out.println("Basic Hospital: \n" + room + "\n");
			
	roomBuilder = new IntensiveCareRoom();
	hospital = new Hospital(roomBuilder);
	hospital.construcRoom();
	room = hospital.getRoom();
	System.out.println(room + "\n");
	
	roomBuilder = new ReceptionRoom();
	hospital = new Hospital(roomBuilder);
	hospital.construcRoom();
	room = hospital.getRoom();
	System.out.println(room + "\n");
	
	roomBuilder = new WaitingRoom();
	hospital = new Hospital(roomBuilder);
	hospital.construcRoom();
	room = hospital.getRoom();
	System.out.println(room + "\n");
	}
}
