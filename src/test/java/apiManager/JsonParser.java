package apiManager;

import io.restassured.path.json.JsonPath;

public class JsonParser {
	static JsonPath parser=null;
	public static void startParser(String response) {
		parser=new JsonPath(response);
	}

	//will study generic at method level and will implement
	public static String getData(String path){
		
		return parser.getString(path);
	}
	
	public static float getfloatData(String path) {
		return parser.getFloat("");
	}
}
