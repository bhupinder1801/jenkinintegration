package org.testing.utilities;

import java.util.regex.Pattern;

public class JsonvariableReplacement {
	
	public static String Replace(String body,String key,String value)
	{
		body = body.replaceAll(Pattern.quote("{{"+key+"}}"), value);
		return body;
	}
	{
		
	}

}
