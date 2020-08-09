package org.testing.utilities;

import com.jayway.restassured.response.Response;

public class StatuscodeValidation {
	
	public static void Codecheck(Response res,int expectedcode)
	{
		
		if(res.statusCode()==expectedcode)
		{
			System.out.println("status code matched");
		}
		
	}

}
