package org.testing.testscript;

import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testing.teststeps.HTTPmethods;
import org.testing.utilities.JsonFile;
import org.testing.utilities.JsonvariableReplacement;
import org.testing.utilities.PropertiesFile;
import org.testing.utilities.ResponseExtractionusingJsonpath;
import org.testing.utilities.StatuscodeValidation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

@Test
public class TC1 {
static String id;static Response resp;
	
public static void PostTc() throws IOException
	{
		Properties p = PropertiesFile.propertiesfileLoad("../art/src/test/java/org/testing/environment/URI.properties");
		String bodyy = JsonFile.Jsonfileload("../art/src/test/java/org/testing/resources/bodydata.json");
		Random r = new Random();
		Integer r1 = r.nextInt();
		bodyy = JsonvariableReplacement.Replace(bodyy, "id", r1.toString());
		System.out.println(bodyy);
		HTTPmethods http = new HTTPmethods(p);
		 resp=http.Post("QA_URI", bodyy);
		StatuscodeValidation.Codecheck(resp, 201);
		id=ResponseExtractionusingJsonpath.extract(resp, "id");
		
	}

}
