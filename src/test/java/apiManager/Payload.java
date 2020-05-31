package apiManager;

public class Payload {
	
	public static String getPayload() {
		return CreateEmployee.book();
	}
	
	public static String updateEmployee() {
		
		return "{\r\n" + 
				"    \"name\": \"Prince\",\r\n" + 
				"    \"job\": \"Rohtak\"\r\n" + 
				"}";
	}
	
	public static String addPlace() {
		
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Rahul Shetty Academy\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
	}
	
	//methods for dynamic handling 
public static String updatePlace(String placeId,String placeName) {
	
	return "{\r\n" + 
			"   \r\n" + 
			"    \"place_id\": \""+placeId+"\",\r\n" + 
			"    \"address\": \""+placeName+"\",\r\n" + 
			"    \"key\":\"qaclick123\"\r\n" + 
			"}\r\n" + 
			"";
}

public static String addBook(String isbn, String aisle) {
	return "{\r\n" + 
			"\r\n" + 
			"\"name\":\"Learn Appium Automation with Prince1\",\r\n" + 
			"\"isbn\":\""+isbn+"\",\r\n" + 
			"\"aisle\":\""+aisle+"\",\r\n" + 
			"\"author\":\"Prince Kumar\"\r\n" + 
			"}\r\n" + 
			"";
}

public static String deleteBook(String ID) {
	
	return "{\r\n" + 
			" \r\n" + 
			"\"ID\" : \""+ID+"\"\r\n" + 
			" \r\n" + 
			"} \r\n" + 
			"";
}

}
