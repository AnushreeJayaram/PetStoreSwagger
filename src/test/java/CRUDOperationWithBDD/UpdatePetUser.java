package CRUDOperationWithBDD;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdatePetUser 
{
	@Test
	public void updatePetUser()
	{
	JSONObject jObj= new JSONObject();
	jObj.put("id",2);
	jObj.put("username","Anu");
	jObj.put("firstName","Anushree");
	jObj.put("lastName","JayaramVivek");
	jObj.put("email","anu@gmail.com");
	jObj.put("password","Anu123456");
	jObj.put("phone","8888888888");
	jObj.put("userStatus",2);
	
	baseURI = "https://petstore.swagger.io/v2";
	
	given()
	.body(jObj)
	.contentType(ContentType.JSON)
	
	.when()		
	.put("/user/Anu")
	
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
	
	}

}
