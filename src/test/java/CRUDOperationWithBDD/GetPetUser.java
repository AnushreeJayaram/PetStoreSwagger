package CRUDOperationWithBDD;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class GetPetUser 
{
	public void getPetUser()
	{
		 baseURI = "https://petstore.swagger.io/v2";
		
	when()
	.get("/user/Anu")
	
	.then()
	.assertThat()
	.statusCode(200)
	.contentType(ContentType.JSON)
	.log().all();
	}

}
