package data_for_make;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileManager {

	protected File FileObject = null;
	protected FileInputStream InputStream = null;
	protected FileOutputStream OutputStream = null;

	protected FileReader Reader = null;
	protected FileWriter Writer = null;

	public FileManager(String filePath) throws Exception{
		
		FileObject = new File(filePath);
		InputStream = new FileInputStream(FileObject);
		OutputStream = new FileOutputStream(FileObject);
		
		Reader = new FileReader(FileObject);
		Writer = new FileWriter(FileObject);
		
	}

}
