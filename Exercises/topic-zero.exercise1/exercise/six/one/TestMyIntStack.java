package exercise.six.one;

public class TestMyIntStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyIntStack m1 = new MyIntStack(10);
		m1.push(10);
		m1.push(4);
		m1.push(7);
		m1.push(2);
		m1.push(8);
		System.out.println(m1);
		m1.push(6);
		m1.push(15);
		m1.push(21);
		m1.push(75);
		m1.push(3);
		System.out.println(m1);
		m1.push(11);
	}

}
