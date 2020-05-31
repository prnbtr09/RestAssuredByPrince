package apiManager;
import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class ApiPractice {
	
	
	
	
	public static void main(String args[]) {
		RestAssured api=new RestAssured();
		
		//it sets the base URI in RestAssured class with following URI
		
		//api.baseURI="http://dummy.restapiexample.com/api/v1/";
		//api.baseURI="https://reqres.in";
		
		
		
		//sample api 1 for automation practice
		//getting & assertion
		//given().log().all().queryParam("page", 2).when().get("/api/users").then().log().all().assertThat().body("page", equalTo(2)).body("total_pages", equalTo(2));
		/*
		 * //Response extraction/************ String
		 * response=given().log().all().queryParam("page",
		 * 2).when().get("/api/users").then().extract().asString(); JsonPath parser=new
		 * JsonPath(response); int itemsOnPage=parser.getInt("per_page");
		 * 
		 * System.out.println(itemsOnPage+" employees on One Page");
		 * 
		 * //String List<String> employees=parser.getList("data.first_name");
		 * 
		 * for(String str:employees) { System.out.println(str); }
		 */
		
	//******************//	
		
		
//update employees
//	
//		//given().log().all().when().get("/api/users/2").then().log().all();
//		
//		//getting employee details
//		String response=given().log().all().queryParam("page",
//				 2).when().get("/api/users").then().extract().asString(); 
//		JsonPath parser=new JsonPath(response);
//		
//		int employeeId=parser.getInt("data.id[0]");
//		String firstName=parser.getString("data.first_name[0]");
//		
//		System.out.println(employeeId+"  "+firstName);
//		
//		
//		given().header("content-type", "application/json").body(Payload.updateEmployee()).when().put("api/users/"+employeeId).then().log().all();
//		
//		
		
		//employee related apis
		//getting existing employees details
		//given().log().all().when().get("employees").then().log().all().assertThat().statusCode(200).body("status", equalTo("success")).header("Content-Length", "595");
		
		//add record
		//given().log().all().body(Payload.getPayload()).when().post("create").then().log().all().assertThat().body("data.name", equalTo("Prince Batra"));
		
		//update record
		//given().log().all().body(Payload.getPayload()).when().put("update/1").then().log().all().assertThat().body("data.salary", equalTo("60000"));
	
		//delete record
		
	//given().log().all().when().delete("delete/1").then().log().all().assertThat().body("status", equalTo("success"));
/*************************************************
 * From here real API practice starts, above area can be ignored
 * @author prikumar9
 * @description API practice	
 */
		/*
		 * //rahul shetty apis for practice
		 * api.baseURI="https://rahulshettyacademy.com";
		 * 
		 * //add place and saving the response in String format String
		 * response=given().queryParam("key",
		 * "qaclick123").body(Payload.addPlace()).log().all().when().post(
		 * "maps/api/place/add/json").then().log().all().extract().asString();
		 * JsonParser.startParser(response); String
		 * place_id=JsonParser.getData("place_id"); String
		 * updatedPlace="Danish Address Oria";
		 * 
		 * //update place String updatedBody=given().queryParam("key",
		 * "qaclick123").body(Payload.updatePlace(place_id,updatedPlace)).header(
		 * "content-type", "application/json").log().all()
		 * .when().put("maps/api/place/update/json")
		 * .then().log().all().assertThat().body("msg",
		 * equalTo("Address successfully updated")).extract().asString();
		 * JsonParser.startParser(updatedBody); String
		 * address=JsonParser.getData("address"); System.out.println(address);
		 * 
		 * 
		 * //verifying address is updated String
		 * actualDetails=given().log().all().queryParam("key",
		 * "qaclick123").queryParam("place_id", place_id)
		 * .when().get("maps/api/place/get/json")
		 * .then().log().all().extract().asString();
		 * 
		 * JsonParser.startParser(actualDetails); String
		 * actualPlace=JsonParser.getData("address");
		 * 
		 * Assert.assertEquals(actualPlace, updatedPlace);
		 */
		
		
		//mocking practice when we don't get API's ready in real
		JsonPath js=new JsonPath(mockingPractice.CoursePrice());
		
		int purchaseamount=js.getInt("dashboard.purchaseAmount");
		System.out.println("purchase amount "+purchaseamount);
		List<Integer> prices=js.getList("courses.price");
		List<Integer> copies=js.getList("courses.copies");
		List<Object> courses=js.getList("courses");
		
		System.out.println("number of courses "+courses.size());
		 System.out.println("branch");
		int totalPrice=0;
		for(int i=0;i<courses.size();i++) {
			totalPrice=totalPrice+((prices.get(i))*(copies.get(i)));
			System.out.println(totalPrice);
		}
		
		System.out.println("Total price of all courses"+totalPrice);
	}

}

