package exercise.five.one;

import java.util.Date;

public class Visit {
	private Customer customer;
	private Date date;
	private double serviceExpense;
	private double productExpense;
	
	public Visit(String name, Date date) {
		this.date = date;
		customer = new Customer(name);
	}
	
	public void setServiceExpense(double ex) {
		serviceExpense = ex;
	}
	public void setProductExpense(double ex) {
		productExpense = ex;
	}
	
	public String getName() {
		return customer.getName();
	}
	public double getServiceExpense() {		
		if(customer.isMember()) {
		double sex = 0;
		DiscountRate dr1 = new DiscountRate();
		sex =  serviceExpense - (dr1.getServiceDiscountRate(customer.getMemberType())*serviceExpense);
		return sex;
		}
		else
			return serviceExpense;
	}
	public double getProductExpense() {
		if(customer.isMember()) {
		double pex = 0;
		DiscountRate dr1 = new DiscountRate();
		pex =  productExpense - (dr1.getProductDiscountRate(customer.getMemberType())*productExpense);
		return pex;
		}
		else
			return productExpense;		
	}
	public double getTotalExpense() {
		double totalExpense = 0;
		totalExpense = getProductExpense() + getServiceExpense();
		return totalExpense;
	}
	
	public String toString() {
		return "Purchased $" + getProductExpense() + " of products and $" + getServiceExpense() + " of services on date: " + date;
	}
}
