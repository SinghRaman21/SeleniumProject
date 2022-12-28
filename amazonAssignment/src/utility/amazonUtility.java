package utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class amazonUtility {
	 
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	
	public static void driverSetUp(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public static WebElement driverElement(String xpath) {
		return driver.findElement(By.xpath(xpath));
	}

}
