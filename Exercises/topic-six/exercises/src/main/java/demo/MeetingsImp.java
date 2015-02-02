package demo;



public class MeetingsImp {
	private String attendees = "";
	private String time;
	
	public MeetingsImp(String roomId, String time) {
		this.time = time;
		attendees = MeetingRoom.getComponent(roomId);
	}
	
	public MeetingsImp() {
		
	}
	
	public String getAttendees() {
		return attendees;
	}

	public String getTime() {
		return time;
	}
	
	public void setTime(String time) {
		this.time = time;
	}
}
