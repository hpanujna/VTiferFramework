import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchPopupFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    WebDriverManager.chromedriver().setup();
		    WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    
		    /*
		    driver.get("https://jqueryui.com/droppable/ ");
		
		    driver.switchTo().frame(0);
		    WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		    WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		    Actions act = new Actions(driver);
		    act.dragAndDrop(drag, drop).perform();
		    */
		
		
		    driver.get("https://demo.automationtesting.in/Frames.html");
		    
		    //switch by index
		    //driver.switchTo().frame(1);
		    
		    //switch by name/id
		    //driver.switchTo().frame("singleframe");
		    
		    //switch by webelement
		    WebElement frame = driver.findElement(By.xpath("//iframe[@id=\"singleframe\"]"));
		    driver.switchTo().frame(frame);
		    driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Selenium");
		    
		    driver.findElement(By.xpath("//a[text()=\"Nested Frames\"]")).click();
		    
		    WebElement leftFrame = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		    driver.switchTo().frame(leftFrame);
		     System.out.println(driver.findElement(By.xpath("//body[contains(text()='LEFT')]")).getText());
		

	}

}
