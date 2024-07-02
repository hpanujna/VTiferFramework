package BasicsBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingSVG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://www.kayak.co.in/");
        driver.findElement(By.xpath("//*[name()='svg' and @class=\"c8LPF-icon\"]")).click();
		
		
		
		
		
		
	}

}
