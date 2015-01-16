package exercise.two;

public class TestMyHouse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HouseBuilder houseBuilder = new BasicHouse();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.construcHouse();
		House house = houseDirector.getHouse();
		System.out.println("Basic House: " + house);
				
		houseBuilder = new StandardHouse();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.construcHouse();
		house = houseDirector.getHouse();
		System.out.println("Standard House: " + house);
		
		houseBuilder = new EnchancedHouse();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.construcHouse();
		house = houseDirector.getHouse();
		System.out.println("Advanced House: " + house);
		
	}

}
