import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoWebShop {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("./src/test/resources/TestData/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String website = pobj.getProperty("url");
		String user = pobj.getProperty("email");
		String pass = pobj.getProperty("password");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(website);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id=\"Email\"]")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id=\"Password\"]")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		

	}

}
