package dataDrivenScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("./TestResources/testData.properties");
		
		Properties prop= new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
