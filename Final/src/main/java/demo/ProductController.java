package demo;

import java.util.List;

import model.Product;

import org.hibernate.HibernateException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import services.ProductRegistrationImp;

@RestController
public class ProductController {
	

	private ProductRegistrationImp productImplementation;
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public List<Product> productByName(@PathVariable String name) throws HibernateException {
		List<Product> listOfProducts = null;
		listOfProducts = productImplementation.getProductByName(name);
		return listOfProducts;
	}
	

	@RequestMapping(value = "/{type}", method = RequestMethod.GET)
	public List<Product> productByType(@PathVariable String type) throws HibernateException {
		List<Product> listOfProducts = null;
		listOfProducts = productImplementation.getProductByType(type);
		return listOfProducts;
	}
	
	@RequestMapping(method = RequestMethod.PUT) 
	public void retireProduct(Product product, int qty) {
		if(productImplementation.retireProduct(product, qty))
			System.out.println("Item adquired");
	}
}
