package stepDefinitions;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class prince_practice {

	
	@Given("^test$")
	public void test(DataTable arg1) throws Throwable {
	  List<Map<String,String>> ls=arg1.asMaps(String.class, String.class);
	  
System.out.println("second thread");
System.out.println(Thread.currentThread());
	   
	}

	@When("^prince$")
	public void prince() throws Throwable {
	  System.out.println("test");
	}
}
