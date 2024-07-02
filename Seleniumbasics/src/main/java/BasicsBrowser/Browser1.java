package BasicsBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
   WebDriverManager.chromedriver().setup();
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.amazon.in");
   driver.manage().window().maximize();
   Thread.sleep(1000);
   //System.out.println(driver.getTitle());
   //driver.findElement(By.xpath("//li[@id='menu-item-6119']//a[@class='menu-link'][normalize-space()='Login']")).click();
   //driver.findElement(By.xpath("//input[@id=\"eael-user-login\"]")).sendKeys("anujnapadmesh@gmail.com");
   //driver.findElement(By.xpath("//input[@name=\"eael-user-password\"]")).sendKeys("Intern@57");
   //driver.findElement(By.xpath("//input[@id=\"eael-user-login\"]")).click();
   //driver.findElement(By.cssSelector("#eael-login-submit")).click();
   
   driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Alarm clock");
   //driver.findElement(By.xpath("input[value='Go']")).click();
  //tagname[att="att value"] css selector
   //absolute x path parent/child/attribute[index]
   
   driver.findElement(By.cssSelector("input[value=\"Go\"]")).click();
   //driver.findElement(By.xpath("span[id=\"nav-search-submit-text\"]")).click();
  String text = driver.findElement(By.xpath("//span[text()=\"Orpat Beep Alarm Clock "
   		+ "(Black, Tbb-137, Plastic, 15Wx27Lx28H Inches)\"]")).getText();
   System.out.println(text);
   
   //driver.findElement(null)
   Thread.sleep(5000);
   //WebElement staticDropdown = driver.findElement(By.id("s-result-sort-select_0"));
   //Select dropdown = new Select(staticDropdown);
   //dropdown.selectByIndex(1);
   
   
	}

}
