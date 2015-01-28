package CRUD;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCrudService {

	@Test
	public void testNewUser() {
		UserServiceInterface userService = new UserService();
		userService.createUser("Gonzalo", 5);
		assertEquals(userService.readUser(userService.getID()), "Gonzalo: status-> online friends-> 5 and the photo inscripcionm.xps has 0 likes");	
	}
	
	
	@Test
	public void testUpdate() {
		UserServiceInterface userService = new UserService();
		userService.createUser("Gonzalo");
		assertEquals(userService.readUser(userService.getID()), "Gonzalo: status-> online friends-> 0 and the photo inscripcionm.xps has 0 likes");
		userService.addLike();
		userService.addFriend();
		assertEquals(userService.readUser(userService.getID()), "Gonzalo: status-> online friends-> 1 and the photo inscripcionm.xps has 1 likes");
	}
	
}
