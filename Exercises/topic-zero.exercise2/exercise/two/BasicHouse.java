package exercise.two;

public class BasicHouse implements HouseBuilder {
	private House basic;
	
	public BasicHouse() {
		basic = new House();
	}
	
	@Override
	public void buildBackyard() {
		basic.setBackyard(20.0);
	}
	@Override
	public void buildKitchen() {
		basic.setKitchen(2.0);
	}
	@Override
	public void buildBathroom() {
		basic.setBathroom("one", 3.0);
	}
	@Override
	public void buildRoom() {
		basic.setRoom("two", 4.0);
	}
	@Override
	public void buildLivingroom() {
		basic.setLivingroom(4.0);
	}
	@Override
	public House getHouse() {
		return basic;
	}
}
