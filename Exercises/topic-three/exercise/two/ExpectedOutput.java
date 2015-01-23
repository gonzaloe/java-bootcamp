package exercise.two;

import java.util.ArrayList;
import java.util.List;

public class ExpectedOutput {
	
	private List<String> list = new ArrayList<String>();

	public ExpectedOutput(int option) {
		setStrings(option);
	}
	public List<String> getList() {
		return list;
	}
	
	public void setStrings(int option) {
		switch(option) {
		case 1:
			list.add("This is a chain with 30 charac");
			break;
		case 2:
			list.add("Hello W");
			list.add("orld!");
			break;
		case 3:
			list.add("a b");
			list.add("c d");
			list.add("e f");
			break;
		case 4:
			list.add("Excel");
			list.add("ent");
			break;
		default:
			break;
		}
		
	}
	
}
