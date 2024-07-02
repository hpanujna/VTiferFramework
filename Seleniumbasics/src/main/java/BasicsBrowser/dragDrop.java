package BasicsBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
		  /* 
		   driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		   Actions act = new Actions(driver);
		   WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		   WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		   act.dragAndDrop(drag, drop).perform();
		   */
		   
		   
		   /*
		   driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		   Actions act = new Actions(driver);
		   WebElement dclick = driver.findElement(By.xpath("//button[text()=\"Double-Click Me To See Alert\"]"));
		   act.doubleClick(dclick).perform();
		   */
	    
	    driver.get("https://makemytrip.com");
	    Actions act = new Actions(driver);
	    act.moveByOffset(40,60).click().perform();
		   
		   
	}

}
