package exercise.one.nine;

public class TestMyTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTime t1 = new MyTime(23,58,58);
		
		System.out.println(t1);
		t1.nextSecond();
		t1.nextMinute();
		System.out.println(t1);
	}

}
