package demo;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import services.UserRegistrationImp;
import dao.Product;
import dao.ProductBuilder;
import dao.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = FinalApplication.class)
@WebAppConfiguration
public class FinalApplicationTests {

	@Test
	public void testNewUserRegAndLog() {
		
		User user = new User();
        user.setLastName("Espeche");
        user.setFirstName("Gonzalo");
        user.setUserName("espinaco");
        user.setEmail("espeche.gonzalo@gmail.com");
        user.setPassword("mypassword");
        user.setJoinedDate(new Date());
        
        User user2 = new User();
        user2.setLastName("Gomez");
        user2.setFirstName("Emanuel");
        user2.setUserName("vogeldios");
        user2.setEmail("pavloseva@gmail.com");
        user2.setPassword("megabestia");
        user2.setJoinedDate(new Date());
        
      
        UserRegistrationImp imp = new UserRegistrationImp();
        imp.addUser(user);
        imp.addUser(user2);
        
        Session session = MySessionFactory.getSessionFactory().openSession();
        session.beginTransaction();
        user = (User) session.get(User.class, "espinaco");
        assertEquals(user.getLastName(), "Espeche");
        user2 = (User) session.get(User.class, "vogeldios");
        assertEquals(user2.getFirstName(), "Emanuel");
        
        assertEquals(imp.login("espinaco", "mypassword"), true);

	}
	
	@Test
	public void testNewProduct() {
		
		ProductBuilder banana = new Product("Banana", 4.50, 3000);
        
        assertEquals(banana.getProduct().getQtyAvailable(), 3000);
        assertEquals(banana.getProduct().getType(), "Banana");
        
	}
}
