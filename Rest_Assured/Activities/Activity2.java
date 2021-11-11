import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity2 {

		  @Test
		  public void f() {
			  
		  String URI="https://petstore.swagger.io/v2/user";
			  String reqBody= "{\"id\": 7321,\n"
			  		+ "  \"username\": \"nidhi\",\n"
			  		+ "  \"firstName\": \"Justin\",\n"
			  		+ "  \"lastName\": \"Case\",\n"
			  		+ "  \"email\": \"justincase@mail.com\",\n"
			  		+ "  \"password\": \"password123\",\n"
			  		+ "  \"phone\": \"9812763450\"}";
			  Response response=given().contentType(ContentType.JSON).body(reqBody).when().post(URI);
			  System.out.println(response.statusCode());
		  }
		  @Test
		  public void f1() {
			  String URI="https://petstore.swagger.io/v2/user";
			  Response res=given().contentType(ContentType.JSON).when().pathParam("username","nidhi").get(URI+"/{username}");
				 System.out.println(res.statusCode());
		  }
		  
			
		  @Test
		  public void f2() { 
			  String URI="https://petstore.swagger.io/v2/user";
			 Response res1=given().contentType(ContentType.JSON).when().pathParam("username","nidhi").delete(URI+"/{username}");
			 System.out.println(res1.statusCode());
		}
		}
