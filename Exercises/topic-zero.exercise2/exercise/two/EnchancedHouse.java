package exercise.two;

public class EnchancedHouse implements HouseBuilder {
	private House advanced;
	
	public EnchancedHouse() {
		advanced = new House();
	}
	
	@Override
	public void buildBackyard() {
		advanced.setBackyard(30.0);
	}
	@Override
	public void buildKitchen() {
		advanced.setKitchen(5.0);
	}
	@Override
	public void buildBathroom() {
		advanced.setBathroom("two", 4.0);
	}
	@Override
	public void buildRoom() {
		advanced.setRoom("three", 4.0);
	}
	@Override
	public void buildLivingroom() {
		advanced.setLivingroom(5.5);
	}
	@Override
	public House getHouse() {
		return advanced;
	}
}
