package BasicsBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProKabaddi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		   driver.get("https://www.prokabaddi.com/standings");
		   driver.manage().window().maximize();
		  // String Points = driver.findElement(By.xpath("//p[text()='Puneri Paltan']/../../../following-sibling::div[@class="
		   		//+ "'table-data points']")).getText();
		   //System.out.println(Points);
		   String Won = driver.findElement(By.xpath("//p[text()='141']/../preceding-sibling::div[@class=\"table-data team\"]")).getText();
		   System.out.println(Won);
		   
		   
		   //String Points = driver.findElement(By.xpath("//p[text()='96']")).getText();
		   //System.out.println(Team  + " " + Points);
		   
		   /*List<WebElement> Teams = driver.findElements(By.xpath("//p[@class=\"name\"]"));
			  List<WebElement> Points = driver.findElements(By.xpath("//p[@class=\"count\"]"));
			  //int count = 0;
			for(WebElement name : Teams)
			{
				for (WebElement Score : Points)
				{
					System.out.println("Team : " + name.getText() + " Score : " + Score.getText());
				}
			} */
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
