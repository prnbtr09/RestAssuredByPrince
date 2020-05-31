package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertiesmethods {
	public static Properties prop=new Properties();
	String dataLocation=System.getProperty("user.dir")+"\\src\\test\\java\\data.properties";
	File fileName=new File(dataLocation);
	FileInputStream fis=null;
	
	//constructor
	public  Propertiesmethods() throws IOException {

		fis=new FileInputStream(fileName);
		prop.load(fis);
		System.out.println(dataLocation);
	}


	public static  String getPropertyValue(String key)
	{
		return prop.getProperty(key);
	}

	public  static void setPropertyValue(String key,String value) {
		prop.setProperty(key, value);
	}
}
