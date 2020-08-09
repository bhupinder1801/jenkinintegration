package org.testing.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFile {

	public static String Jsonfileload(String path) throws FileNotFoundException
	{
		File f = new File(path);
		FileInputStream fr = new FileInputStream(f);
		JSONTokener jr = new JSONTokener(fr);
		JSONObject js = new JSONObject(jr);
		
		return js.toString();
	}
}
