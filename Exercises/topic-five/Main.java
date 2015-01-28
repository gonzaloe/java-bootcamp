
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please introduce your password");
		String password = scanner.next();
		DBManager bDManager = new DBManager(password);
		scanner.close();
		
		//Exercise 4
		System.out.println(bDManager.getExerciseFour("Algebra"));
		
		//Exercise 5
		
	}

}