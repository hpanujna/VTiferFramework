package BasicsBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollUsingJavaScriptExec {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        /*
        driver.get("https://amazon.in");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;
        for(int i=0;i<5;i++)
        {
        js.executeScript("window.scrollBy(0,900)");
        Thread.sleep(1000);
        }
        
        for(int i=0;i<3;i++)
        {
        js.executeScript("window.scrollBy(0,-900)");
        Thread.sleep(1000);
        }
        */
        
        driver.get("https://www.facebook.com");
        /*
        WebElement loc = driver.findElement(By.xpath("//a[text()=\"Games\"]"));
        int x = loc.getLocation().getX();
        System.out.println(x);
        int y = loc.getLocation().getY();
        System.out.println(y);
        */
        
        /*
        WebElement loc = driver.findElement(By.xpath("//a[text()=\"Games\"]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(581,787)");
        loc.click();
        */
        
        /*
        WebElement loc = driver.findElement(By.xpath("//a[text()=\"Games\"]"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",loc);
        loc.click();
        */
        
        //scroll complete window
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
        Thread.sleep(2000);
        js.executeScript("window.scrollTo(-document.body.scrollHeight,0)");
        
        
        
        
        
        
        
        
        
	}

}
