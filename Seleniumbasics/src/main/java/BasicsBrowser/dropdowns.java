package BasicsBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdowns {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	   
	    driver.get("https://www.facebook.com");
	    driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
	    Thread.sleep(2000);
	    WebElement dateList = driver.findElement(By.xpath("//select[@aria-label=\"Day\"]"));
	    Select sel = new Select(dateList);
	    //sel.selectByIndex(5);
	    sel.selectByValue("9");
	    
	    
	    WebElement MonthList = driver.findElement(By.xpath("//select[@aria-label=\"Month\"]"));
	    Select sele = new Select(MonthList);
	    //sele.selectByIndex(9);
	    sele.selectByValue("2");
	    
	    WebElement yearList = driver.findElement(By.xpath("//select[@aria-label=\"Year\"]"));
	    Select selec = new Select(yearList);
	    //selec.selectByIndex(5);
	    //selec.selectByValue("1995");
	    selec.selectByVisibleText("1995");
	    
	    
	    
	    /*
	    driver.get("https://www.irctc.co.in/nget/train-search");
	    //driver.findElement(By.xpath("//li[@aria-label=\"First Class (FC)\"]")).click();
	    WebElement Allclasses = driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-11 ui-dropdown ui-widget ui-state-default ui-corner-all\"]"));
	    //Thread.sleep(2000);
	    Select allc = new Select(Allclasses);
	    allc.selectByValue("First Class (FC)");
	    
	    WebElement Section = driver.findElement(By.xpath("//div[@class=\"ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all\"]"));
	    //Thread.sleep(2000);
	    Select sectionsel = new Select(Section);
	    sectionsel.selectByIndex(2);
	    */
	    
	    
	}

}
