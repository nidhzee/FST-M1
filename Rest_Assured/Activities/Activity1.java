import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.CoreMatchers.equalTo;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Activity1 {
  @Test
  public void f() {
	  
  String URI="https://petstore.swagger.io/v2/pet";
	  String reqBody= "{"
	            +"\"id\":732,"
	            		+ "\"name\":\"Riley\"" + ","
	            		+ "\"status\":\"Alive\""
	            				+ "}";
	  Response response=given().contentType(ContentType.JSON).body(reqBody).when().post(URI);
	  System.out.println(response.statusCode());
  }
  @Test
  public void f1() {
	  String URI="https://petstore.swagger.io/v2/pet";
	  Response res=given().contentType(ContentType.JSON).when().pathParam("petId","732").get(URI+"/{petId}");
		 System.out.println(res.statusCode());
  }
  
	
  @Test
  public void f2() { 
	  String URI="https://petstore.swagger.io/v2/pet";
	 Response res1=given().contentType(ContentType.JSON).when().pathParam("petId","732").delete(URI+"/{petId}");
	 System.out.println(res1.statusCode());
}
}
