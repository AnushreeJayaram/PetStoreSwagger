package CRUDOperationWithBDD;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;



public class DeletePetUser 
{
	@Test
	public void deletePetUser()
	{

	baseURI = "https://petstore.swagger.io/v2";

	when()		
	.delete("/user/Anu")
	
	.then()
	.assertThat()
	.statusCode(404)
	.log().all();
	
	}

}
