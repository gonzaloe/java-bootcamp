package CRUD;

import java.io.File;

import javax.swing.JFileChooser;

public class Photo {
	
	private File image;
	private int likes;
	
	public Photo() {
		JFileChooser jFileChooser = new JFileChooser();
		int option = jFileChooser.showOpenDialog(null);
		if(option==JFileChooser.APPROVE_OPTION) {
			this.image = jFileChooser.getSelectedFile();
		}
		this.likes = 0;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public String getImageName() {
		return image.getName();
	}
	
	public void addLike() {
		this.likes++;
	}
}
