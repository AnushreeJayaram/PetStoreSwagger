package CRUDOperationWithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class CreatePetUser
{
	
	@Test
	public void addPetUser()
	{
	JSONObject jObj= new JSONObject();  
	jObj.put("id",2);
	jObj.put("username","Anu");
	jObj.put("firstName","Anushree");
	jObj.put("lastName","Jayaram");
	jObj.put("email","anu@gmail.com");
	jObj.put("password","Anu123");
	jObj.put("phone","8888888888");
	jObj.put("userStatus",2);
	
	baseURI = "https://petstore.swagger.io/v2";
	
//	Step1: create pre-requisite 
	
	given()
	.body(jObj)
	.contentType(ContentType.JSON)
	
//	Step2: perform action
	.when()		
	.post("/user")
	
//Step3: Validation
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
	
	}

}
