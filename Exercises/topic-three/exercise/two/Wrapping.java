package exercise.two;

import java.util.ArrayList;
import java.util.List;

public class Wrapping {

	private int length;
	private char[] chain; 
	private List<String> secondChain = new ArrayList<String>();

	public Wrapping(String phrase, int length) {
		this.length = length;
		this.chain = phrase.toCharArray();
	}

	public void setString() {
		String element = "";
		int aux = 0;
		for(int i  = 0; i<chain.length; i++) {
			if(aux == length) {
				addWords(element);
				element = "";
				aux = 0;
				if(chain[i] == ' ')
					continue;
			}
			element += chain[i];
			aux++;
		}
		addWords(element);
	}
		
	public void addWords(String element) {
		secondChain.add(element);
	}
	
	public List<String> getList() {
		return secondChain;
	}
}
