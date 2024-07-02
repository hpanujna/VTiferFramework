package BasicsBrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollBarRobot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_PAGE_DOWN);
        rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        rob.keyPress(KeyEvent.VK_PAGE_DOWN);
        rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
        
        rob.keyPress(KeyEvent.VK_PAGE_DOWN);
        rob.keyRelease(KeyEvent.VK_PAGE_DOWN);
	}

}
