package hooks;

import java.io.IOException;
import java.sql.Connection;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import  Logs.Logging;
import Runner.TestRunner;
import Utils.ScreenShots;
import common.environmentSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends TestRunner{
	
	public static Connection DBConnection;

	@Before
	public void startScenario(Scenario scenario) throws IOException {
		//Logging.startTestCase();
		environmentSetup.setUpBrowserConnection();
		
	}

	@After
	public void endScenario(Scenario scenario)
	{
		Logging.endTestCase();
		if(scenario.isFailed())
		{
			System.out.println("Failed");
			ScreenShots.takeScreenShot(scenario);
		}else {
			System.out.println("Passed");
		}
	}
	
	
	@BeforeClass
	public void preOperation() throws IOException {
		environmentSetup.setUpBrowserConnection();
		//DBConnection=environmentSetup.setUpDBConnection();
	}
	
	@AfterClass
	public void postOperation() {
		
//		environmentSetup.endBrowserConnection();
//		environmentSetup.endDBConnection();
		
	}
}
