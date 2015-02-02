package demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MeetingController {

	private Map<String, Object> map = new HashMap<String, Object>();
	private String roomId = "403";
	private String roomId2 = "203";
	private String newTime = "14:00 to 15:00hs";
	
	@RequestMapping(method = RequestMethod.POST)
	Map<String, Object> addMeeting() {
		map.put(roomId, new MeetingsImp(roomId, "12:00 to 13:00hs"));
		map.put(roomId2, new MeetingsImp(roomId2, "18:00 to 19:00hs"));
		return map;
	}
		
    @RequestMapping(value = "/{roomId}", method = RequestMethod.GET)
    public MeetingsImp getMeetingById(String roomId) {
    	return (MeetingsImp) map.get(this.roomId);
    }
    
    @RequestMapping(method = RequestMethod.DELETE)
    String deleteMeeting() throws RuntimeException {
    	map.remove(roomId);
    	return "Meeting was deleted succesfully";
    }
    
    @RequestMapping(method = RequestMethod.PUT) 
    Map<String, Object> updateMeeting() {
    	MeetingsImp m1 = (MeetingsImp) map.get(roomId);
    	m1.setTime(newTime);
    	map.remove(roomId);
    	map.put(roomId, m1);
    	return map;
    }    
}