package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;

import org.json.JSONObject;
import org.testing.teststeps.HTTPmethods;
import org.testing.utilities.PropertiesFile;
import org.testing.utilities.StatuscodeValidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC4 {
	@Test
public	void Puttc() throws IOException
	{
		Properties p = PropertiesFile.propertiesfileLoad("../art/src/test/java/org/testing/environment/URI.properties");
		JSONObject obj = new JSONObject(TC1.resp.asString());
		obj.put("empID", 511531);
		
		HTTPmethods https = new HTTPmethods(p);
		Response resp=https.PutLogic("QA_URI", obj.toString(), TC1.id);
		
		//StatuscodeValidation.Codecheck(resp, 201);
		System.out.println(resp.asString()+resp.statusCode());
	}

}
