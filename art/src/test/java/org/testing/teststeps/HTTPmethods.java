package org.testing.teststeps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTPmethods {

	Properties pr;
	public HTTPmethods(Properties pr)
	{
		this.pr = pr;
	}
	
	public Response Post(String URI_Key,String bodydata)
	{
	Response res = given()
			.contentType(ContentType.JSON)
			.body(bodydata)
			.when()
			.post(pr.getProperty(URI_Key));
	return res;
	}
	
	public Response PutLogic(String URI_Key,String bodydata,String endpoint)
	{
		String uri =pr.getProperty(URI_Key)+"/"+endpoint;
	Response res = given()
			.contentType(ContentType.JSON)
			.body(bodydata)
			.when()
			.put(uri);
	return res;
	}
	public Response PatchLogic(String URI_Key,String bodydata,String endpoint)
	{
		String uri =pr.getProperty(URI_Key)+"/"+endpoint;
	Response res = given()
			.contentType(ContentType.JSON)
			.body(bodydata)
			.when()
			.patch(uri);
	return res;
	}
}
