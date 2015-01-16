package exercise.five.one;

public class Customer {
	private String name;
	private boolean member = false;
	private String memberType;
	
	public Customer(String name) {
		
	}

	public void setMember(boolean member) {
		this.member = member;
	}

	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	
	public String getName() {
		return name;
	}

	public boolean isMember() {
		return member;
	}

	public String getMemberType() {
		return memberType;
	}
	
	
}
