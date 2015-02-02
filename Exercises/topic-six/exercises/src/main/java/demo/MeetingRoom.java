package demo;

public class MeetingRoom {
	private static String attendes = "";
		
	public static String getComponent(String roomNumber) {
		switch(roomNumber) {
		case "403":
			attendes = "Gonzalo, Vania, Matias, Leandro";
			break;
		case "801":
			attendes = "Ramiro, Renzo, Nerina, Maria";
			break;
		case "203":
			attendes = "Hugo, Omar, Pilar, Santino";
			break;
		default:
			break;
		}
		return attendes;
	}
	
}
