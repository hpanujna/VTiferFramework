package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchDataFromExtSource {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//FileInputStream fin = new FileInputStream("C:\\Users\\nirimag\\Downloads\\data.properties");
		//file is within a project
		FileInputStream fin = new FileInputStream("./data.properties.txt");
		
		
		Properties pro = new Properties();
		pro.load(fin);
		String URL = pro.getProperty("url");
		driver.get(URL);
		
		

		
		
		
		
	}

}
