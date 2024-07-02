package BasicsBrowser;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DataUtility {
	
	public String getDataFromProperties(String key) throws Throwable 
	{
	FileInputStream fis = new FileInputStream("./src/test/resources/TestData/commondata.properties");
	Properties pobj = new Properties();	
	pobj.load(fis);
	
	String value = pobj.getProperty(key);
	return value;
		
		
		
	}
	
	
	
	
	

}
