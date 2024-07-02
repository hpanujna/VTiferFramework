package BasicsBrowser;

import java.util.List;import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Bigbasket {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
 	    driver.get("https://www.bigbasket.com");
 	    driver.findElement(By.xpath("(//input[@placeholder=\"Search for Products...\"])[2]")).sendKeys("Mango",Keys.ENTER);
 	    Thread.sleep(5000);
 	    //String name = driver.findElement(By.xpath("//img[@title=\"Fresho Alphonso Mango - Badami 1 kg\"]"));
        String name = driver.findElement(By.xpath("//img[@title=\"Fresho Alphonso Mango - Badami 1 kg\"]")).getText();
        System.out.println(name);
        Thread.sleep(5000);
        driver.close();
	}

}
