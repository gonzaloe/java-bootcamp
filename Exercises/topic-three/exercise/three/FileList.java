package exercise.three;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.JFileChooser;

public class FileList {
	
	Set<File> list = new TreeSet<>();
	

	public void openFile() {
		JFileChooser jFileChooser = new JFileChooser();
		int option = jFileChooser.showOpenDialog(null);
		if(option==JFileChooser.APPROVE_OPTION) {
			File newFile = jFileChooser.getSelectedFile();
			addToList(newFile);
		}
	}
	
	public void addToList(File newFile) {
		if(list.size() < 15) {
		list.add(newFile);
		}
		else {
			list.remove(15);
			list.add(newFile);
		}
	}
	
	public String getFileNames() {
		String files = "";
		for( Iterator<File> iterator = list.iterator() ; iterator.hasNext();) {
			files += iterator.next().getName() + " ";
		}
		return files;
	}
}
