package exercise.one.eleven;

public class Book {
	
	private String name;
	private Author[] author;
	private double price;
	private int qtyInStock;
	
	public Book (String name, Author[] author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
		qtyInStock = 0;
	}
	
	public Book (String name, Author[] author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
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
		return getName() + " by " + author.length + " authors";	
	}
	
	public void printAuthors() {
		for(int i=0;i<author.length;i++) {
		System.out.println(author[i]);
		}
	}
}
