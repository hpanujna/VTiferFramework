package BasicsBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
			   driver.get("https://www.amazon.in");
			  WebElement ele = driver.findElement(By.xpath("//a[text()='Today’s Deals']"));
			   Actions act=new Actions(driver);
			   act.moveToElement(ele).perform();
			   act.contextClick(ele).perform();
	}

}
