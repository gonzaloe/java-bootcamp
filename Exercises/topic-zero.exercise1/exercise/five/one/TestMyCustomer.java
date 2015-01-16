package exercise.five.one;

import java.util.Date;

public class TestMyCustomer {

	public static void main(String[] args) {

		Customer c1 = new Customer("Ana");
		Customer c2 = new Customer("Gonzalo");
		Customer c3 = new Customer("Ricardo");
		
		c1.setMember(true);
		c1.setMemberType("Premium");
		c2.setMember(true);
		c2.setMemberType("Gold");
		c3.setMember(true);
		c3.setMemberType("Silver");
		
		Date d1 = new Date();
		Visit v1 = new Visit(c1.getName(), d1);
		v1.setProductExpense(12.35);
		v1.setServiceExpense(15.56);
		System.out.println(v1);
		
		Date d2 = new Date();
		Visit v2 = new Visit(c2.getName(), d2);
		v2.setServiceExpense(30.40);
		System.out.println(v2);
		
		Date d3 = new Date();
		Visit v3 = new Visit(c3.getName(), d3);
		v3.setProductExpense(4.35);
		System.out.println(v3);
	}

}
