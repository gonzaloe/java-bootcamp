package exercise.one.twelve;

import java.util.ArrayList;

public class Book {
	
	private String name;
	private Author[] author = new Author[5];
	private int numAuthors = 0;
	private double price;
	private int qtyInStock;
	
	public Book (String name, double price) {
		this.name = name;
		this.price = price;
		qtyInStock = 0;
	}
	
	public Book (String name,  double price, int qtyInStock) {
		this.name = name;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	public String getName() {
		return name;
	}
	
	public Author[] getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	} 
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	
	public String toString() {
		return getName() + " by " + numAuthors + " authors" ;	
	}
	
	public void printAuthors() {
		for(int i=0;i<author.length;i++) {
			if(author[i]!=null)
			System.out.println(author[i]);
		}
	}
	
	public void addAuthor(Author author) {
	    	  this.author[numAuthors] = author;
	    	  numAuthors++;	        	  
	}
	

	public boolean removeAuthorByName(String authorName) {
		ArrayList<Author> a = new ArrayList<Author>();
		for(int i=0;i<numAuthors;i++) {
			String name = author[i].getName();
			if(name.equals(authorName)) {
			
			}
			else {
				a.add(author[i]);
				System.out.println(author[i]);
			}
		}
		return true;	
		}

			
		
				
}
