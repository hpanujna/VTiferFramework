import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ChromeOptions opt = new ChromeOptions();
         opt.addArguments("--incognito");
         WebDriverManager.chromedriver().setup();
         WebDriver driver  = new ChromeDriver(opt);
         driver.get("https://www.amazon.in");
         
         
         
		
	}

}
