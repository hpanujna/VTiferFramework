package BasicsBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.get("https://www.irctc.co.in/nget/train-search");
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    //driver.findElement(By.xpath("//li[@aria-label=\"First Class (FC)\"]")).click();
	    WebElement Allclasses = driver.findElement(By.xpath("//select[@class=\"ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all\"]"));
	    //Thread.sleep(2000);
	    Select allc = new Select(Allclasses);
	    allc.selectByValue("First Class (FC)");
	}

}
