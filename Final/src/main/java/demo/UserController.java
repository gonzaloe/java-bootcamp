package demo;

import model.User;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import services.UserRegistration;

@RestController
public class UserController {
	
	private UserRegistration userImplementation;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(@PathVariable String userName, @PathVariable String password) {
		return userImplementation.login(userName, password);
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.POST)
	public void registration(@PathVariable User user) {
		userImplementation.addUser(user);
	}
	
}
