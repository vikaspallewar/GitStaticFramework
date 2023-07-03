package Common_API_Methods;
import io.restassured.RestAssured;

import static io.restassured.RestAssured.given;

public class API_Methods_Get {
	
	public static int ResponsestatusCode(String BaseURI, String Get_Resource) {
		
		RestAssured.baseURI = BaseURI;
		

		int statusCode = given().header("Content-Type","application/json").when().get(Get_Resource).then().extract().statusCode();
		return statusCode;
	}
		public static String ResponseBody(String BaseURI, String Get_Resource) {
			RestAssured.baseURI = BaseURI;
			
		String ResponseBody = given().header("Content-Type","application/json").
			when().get(Get_Resource).then().extract().response().asPrettyString();
		return ResponseBody;
		}
		
	}


