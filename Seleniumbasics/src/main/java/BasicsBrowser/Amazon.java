package BasicsBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   /*
		
		WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	   driver.get("https://www.amazon.in");
	   
	   driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Bluetooth");
	   driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
	   List<WebElement> list = driver.findElements(By.xpath("//span[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
	int count=0;
	 for( WebElement name : list)
     {
        System.out.println(name.getText());
        count++;
     }
	  System.out.println("Total names : " + count);
	
	
	
	}
*/
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    
	    
		driver.manage().window().maximize();
		
		driver.get("https://www.india.gov.in/");
		
		driver.findElement(By.xpath("//*[text()='Calendar']")).click();
	
		
	}		
}
