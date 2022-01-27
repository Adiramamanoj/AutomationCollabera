package dataDrivenScript;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ToReadDataFromJsonFile {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader fr= new FileReader("./TestResources/testData.json");
		
		JSONParser parser= new JSONParser();
	    JSONObject jsonObj = (JSONObject)parser.parse(fr);
	    String data = (String)jsonObj.get("Client").toString();
	    System.out.println(data);
	}

}
