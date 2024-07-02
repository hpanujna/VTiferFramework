import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("phone",Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ice Blue, 128 GB)']")).click();
		//WebElement phone = driver.findElement(By.xpath("//div[text()='Motorola G34 5G (Ice Blue, 128 GB)']"));)
		//phone.click();
        String mainId = driver.getWindowHandle();
        System.out.println(mainId);
        
        Set<String> allwin = driver.getWindowHandles();
        for (String win : allwin)
		if (!mainId.equals(win))
		{
			driver.switchTo().window(win);
		    WebElement price = driver.findElement(By.xpath("//div[@class=\"Nx9bqj CxhGGd\"]"));
			
			price.getText();
			System.out.println(price);
		}
		}
		
		
		

	}


