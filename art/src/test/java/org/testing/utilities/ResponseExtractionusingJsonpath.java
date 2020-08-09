package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class ResponseExtractionusingJsonpath {
	
	public static String extract(Response res,String jsonpath)
	{
		return res.jsonPath().getString(jsonpath);
	}

}
