package exercise.two;

public class StandardHouse implements HouseBuilder {
	private House standard;
	
	public StandardHouse() {
		standard = new House();
	}
	
	@Override
	public void buildBackyard() {
		standard.setBackyard(25.0);
	}
	@Override
	public void buildKitchen() {
		standard.setKitchen(3.0);
	}
	@Override
	public void buildBathroom() {
		standard.setBathroom("two", 3.0);
	}
	@Override
	public void buildRoom() {
		standard.setRoom("two", 4.0);
	}
	@Override
	public void buildLivingroom() {
		standard.setLivingroom(4.5);
	}
	@Override
	public House getHouse() {
		return standard;
	}
	
}
