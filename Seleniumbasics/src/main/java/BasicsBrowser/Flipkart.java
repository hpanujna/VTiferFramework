package BasicsBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		   driver.get("https://www.flipkart.com");
		   driver.manage().window().maximize();
		   
		   /* driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("phone");
		   driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		  List<WebElement> PhoneNames = driver.findElements(By.xpath("//div[@class=\"KzDlHZ\"]"));
		  List<WebElement> PhonePrices = driver.findElements(By.xpath("//div[@class=\"Nx9bqj _4b5DiR\"]"));
		  //int count = 0;
		for(WebElement name : PhoneNames)
		{
			for (WebElement price : PhonePrices)
			{
				System.out.println("Phone : " + name.getText() + " Price : " + price.getText());
			} 
		   
		   }*/
			//System.out.println( + name + price);
		   
		   driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("phone",Keys.ENTER);
		   WebElement price = driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ice Blue, 128 GB)']/ancestor::div[@class=\"yKfJKb row\"]/descendant::div[@class=\"Nx9bqj _4b5DiR\"]"));
	       System.out.println(price);
	
	
	}
	
	
}
