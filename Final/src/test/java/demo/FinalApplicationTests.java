package demo;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import model.Cart;
import model.Product;
import model.User;

import org.hibernate.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import services.ProductRegistration;
import services.ProductRegistrationImp;
import services.UserRegistration;
import services.UserRegistrationImp;

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
        
      
        UserRegistration imp = new UserRegistrationImp();
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
	
		   Product banana = new Product();
		   banana.setProductID("Banana");
		   banana.setType("Fruit");
		   banana.setPrice(4.50);
		   banana.setQtyAvailable(3000);
		   
	       Product apple = new Product();
	       apple.setProductID("Apple");
	       apple.setType("Fruit");
	       apple.setPrice(3.50);
	       apple.setQtyAvailable(300);
	       
	       ProductRegistration imp = new ProductRegistrationImp();
	       imp.addProduct(banana);
	       imp.addProduct(apple);

	       Session session = MySessionFactory.getSessionFactory().openSession();
	       session.beginTransaction();
	       banana = (Product) session.get(Product.class, "Banana");
	       assertEquals(banana.getType(), "Fruit");
	       assertEquals(banana.getQtyAvailable(), 3000);
	       apple = (Product) session.get(Product.class, "Apple");
	       assertEquals(apple.getType(), "Fruit");
	       
	       
	       imp.retireProduct(banana, 200);
	       assertEquals(banana.getQtyAvailable(),2800);
	}
	
	@Test
	public void testNewCart() {
		
		Cart cart = new Cart();
		
		Product banana = new Product();
		banana.setProductID("Banana");
		banana.setType("Fruit");
		banana.setPrice(4.50);
		banana.setQtyAvailable(3000);
		
	    Product apple = new Product();
	    apple.setProductID("Apple");
	    apple.setType("Fruit");
	    apple.setPrice(3.50);
	    apple.setQtyAvailable(300);
	    
	    cart.setUserID("espinaco");
	    cart.getProductList().add(banana);
	    cart.getProductList().add(apple);
	    
	    Session session = MySessionFactory.getSessionFactory().openSession();
	    session.beginTransaction();
	    session.save(cart);
	    session.getTransaction().commit();
	    session.close();
	}

	
	@Test
	public void testBuySomeProduct() {
		   
		   Product berry = new Product();
		   berry.setProductID("Berry");
		   berry.setType("Fruit");
		   berry.setPrice(4.50);
		   berry.setQtyAvailable(3000);
	       
	       Session session = MySessionFactory.getSessionFactory().openSession(); 
	       session.beginTransaction();  
	       session.save(berry);  
	       session.getTransaction().commit(); 
	       session.close();   
	       
	       ProductRegistration imp = new ProductRegistrationImp();
	       imp.retireProduct(berry, 200);
	       
	       session = MySessionFactory.getSessionFactory().openSession(); 
	       session.beginTransaction();
	       berry = (Product) session.get(Product.class, "Berry");
	       
	       assertEquals(berry.getQtyAvailable(), 2800);
				
	}
}
