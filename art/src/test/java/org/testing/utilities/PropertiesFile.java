package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFile {
	
	public static Properties propertiesfileLoad(String path) throws IOException
	{
		File f = new File(path);
		FileInputStream fr = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fr);
		
		return pr;
		
	}

}
