package tddShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ProductsList {
	
	private List<ProductBuilder> product;
	
	public ProductsList() {
		product = new ArrayList<ProductBuilder>();
	}
	
	public void addProduct(ProductBuilder productBuilder) {
		product.add(productBuilder);
	}
	
	public void removeProduct(ProductBuilder productBuilder) {
		product.remove(productBuilder);
	}
	
	public List<ProductBuilder> getProductsList() {
		return product;
	}
		
	public double getSubtotal(int index, int qty) {
		double subtotal = 0;
		subtotal = product.get(index).retireQty(qty);
		return subtotal;
	}
	
	public int getLength() {
		return product.size();
	}
	public int getQtyAvailable(int index) {
		return product.get(index).getQty();
	}
	
	public double getCheapest() {
		double valor = 0;
		int index = 0;
		valor = product.get(index).getPrice();
		for( index = 1 ;index<product.size(); index++) {
			if(product.get(index).getPrice()>valor) {
				valor = product.get(index).getPrice();
			}
		}
		return valor;
	}
	
	public double getExpensive() {
		double valor = 0;
		valor = product.get(0).getPrice();
		for(int i = 1 ;i>product.size(); i++) {
			if(product.get(i).getPrice()>valor) {
				valor = product.get(i).getPrice();
			}
		}
		return valor;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		  int index = 1;
		  sb.append("Products: \n");
	      for (ProductBuilder aProduct : product) {
	          sb.append(index++ + "  " + aProduct.toString() + "\n");
	      }
	      sb.append("Choose one from the list \n");
	      return sb.toString();
	}
}