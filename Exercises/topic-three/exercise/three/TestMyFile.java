package exercise.three;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMyFile {

	@Test
	public void testFile() {
		FileList fileList = new FileList();
		fileList.openFile();
		assertEquals(fileList.getFileNames(), "ArcheAge.log ");
	}

}
