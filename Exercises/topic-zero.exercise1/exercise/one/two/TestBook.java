package exercise.one.two;

public class TestBook {
	
	public static void main(String[] args) {
		
	Author anAuthor = new Author("Espy", "espeche.gonzalo@gmail.com", 'm');
	Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
	// Use an anonymous instance of Author
	Book anotherBook = new Book("more Java for dummy", new Author("George Martin", "georgem@gmail.com" , 'm'), 29.95, 888);
	
	System.out.println(aBook);
	
	System.out.println("name: " + aBook.getAuthor().getName() + " , email: " + aBook.getAuthor().getEmail());
	
	System.out.println("name: " + anotherBook.getAuthorName() + " , email: " + anotherBook.getAuthorEmail());


	}
}
