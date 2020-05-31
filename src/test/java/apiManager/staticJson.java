package apiManager;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class staticJson {
	
	
	@Test
	public static void testStaticJson() throws IOException {
		RestAssured api=new RestAssured(); 
		api.baseURI="http://216.10.245.166";
		given().log().all().body(getStaticJson("C:\\Users\\prikumar9\\Desktop\\Prince_Self_Study\\AddBook.json")).when().post("Library/Addbook.php ").then().log().all();
	}

	
	public static String getStaticJson(String path) throws IOException {
		
return	new String(Files.readAllBytes(Paths.get(path)));
		
		
	}
}
