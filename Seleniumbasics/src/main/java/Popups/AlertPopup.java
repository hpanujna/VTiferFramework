package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 
		 /*
		 driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.accept();
		 */
		 
		 /*
		 driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.dismiss();
		 */
		 
		 driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
		 Alert alt = driver.switchTo().alert();
		 System.out.println(alt.getText());
		 alt.sendKeys("Alert");
		 alt.accept();
		 
	}

}
