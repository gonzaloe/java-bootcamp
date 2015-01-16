package exercise.two;

public class HouseDirector {
	private HouseBuilder houseBuilder = null;
	
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	public void construcHouse() {
		houseBuilder.buildBackyard();
		houseBuilder.buildKitchen();
		houseBuilder.buildBathroom();
		houseBuilder.buildRoom();
		houseBuilder.buildLivingroom();
	}
	
	public House getHouse() {
		return houseBuilder.getHouse();
	}
}
