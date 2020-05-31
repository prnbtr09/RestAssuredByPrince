package apiManager;
import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;


public class dynamicPayload {
	Properties prop=new Properties();


	@Test (dataProvider = "booksData")
	public void addBook(String Isbn, String aisle) throws IOException
	{
		
		  FileInputStream fis=new
		  FileInputStream("src/test/java/APIPractice.properties"); prop.load(fis);
		  //add book Random ran=new Random(); int a=ran.nextInt(); String
		  //Isbn=prop.getProperty("ISBN")+a; String aisle=prop.getProperty("AISLE")+a;
		 

		RestAssured api=new RestAssured(); 
		api.baseURI="http://216.10.245.166";
		//adding a book
		String res=given().log().all().body(Payload.addBook(Isbn,aisle)).when().post("Library/Addbook.php ").then().log().all().extract().asString();
		JsonParser.startParser(res);
		String ID=JsonParser.getData("ID");

		//getting the book by using author name before deleting
		given().queryParam("author", "Prince Kumar").log().all().
		when().get("/Library/GetBook.php").
		then().log().all();


		//delete a book
		String deletedStatus=given().log().all().header("content-type", "application/json").body(Payload.deleteBook(ID)).when().post("/Library/DeleteBook.php").then().log().all().extract().asString();
		String expectedDeleteStatus=prop.getProperty("DeleteStatus");	
		System.out.println(deletedStatus);
		JsonParser.startParser(deletedStatus);
		Assert.assertEquals(JsonParser.getData("msg"),expectedDeleteStatus);

		//getting the book by using author name
		given().queryParam("author", "Prince Kumar").log().all().
		when().get("/Library/GetBook.php").
		then().log().all().assertThat().statusCode(200);


	}
	
	@DataProvider(name="booksData")
	public Object[][] getData(){
		
		return new Object[][] {{"a1002","1002"},{"b2001","2001"},{"c3001","3001"}}; 
	}

}
