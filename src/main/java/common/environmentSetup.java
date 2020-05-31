package common;

import java.io.IOException;
import java.sql.Connection;

import driverManagement.BaseDriver;

public class environmentSetup {
	
	
	public static void setUpBrowserConnection() throws IOException {
		BaseDriver.setUpBrowserSession();
		
	}
	
	/*
	 * public static Connection setUpDBConnection() { // return
	 * BaseDriver.setUpDBSession(); }
	 */

}
