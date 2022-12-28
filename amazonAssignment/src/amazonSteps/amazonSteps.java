package amazonSteps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.amazonPageObject;
import utility.amazonUtility;

public class amazonSteps extends amazonUtility {

	public static String url = "https://www.amazon.in/";

	@Given("^User open the amazon application$")
	public void user_open_the_amazon_application() throws Exception {

		driverSetUp(url);

	}

	@Then("^Verify user navigation to About this item section$")
	public void verify_user_navigation_to_about_this_item_section() throws Throwable {
		
		driverElement(amazonPageObject.hamburgerMenu).click();//Step to click on Hamburger menu
		Thread.sleep(1000);
		driverElement(amazonPageObject.TvApplianceElectronic_Tab).click();//Step to click on TV,Appliance and electronics link
		Thread.sleep(2000);
		driverElement(amazonPageObject.televisionTab).click();//Step to click on television
		Thread.sleep(2000);
		driverElement(amazonPageObject.samsungCheckBox).click();//Step to click on Samsung 
		Thread.sleep(2000);
		driverElement(amazonPageObject.sortByDropdown).click();//Step to click on Sort 
		Thread.sleep(2000);
		driverElement(amazonPageObject.dropDownValue).click();//Step to click High to low value
		Thread.sleep(2000);
		driverElement(amazonPageObject.secondHighestPriceItem).click();//Step to click on second highest tv price
		Thread.sleep(2000);
		//Switching the window
		Set<String> AllWindowhandles = driver.getWindowHandles();
		ArrayList<String> WindowHandlesList = new ArrayList<String>(AllWindowhandles);

		driver.switchTo().window(WindowHandlesList.get(1));
		Thread.sleep(2000);
		
		//Asserting "about this section" and logging in console 
		System.out.println("About this item is.." + driverElement(amazonPageObject.aboutThisItem).isDisplayed());
		System.out.println("About this item is.." + driverElement(amazonPageObject.aboutThisItem).getText());
		softassert.assertEquals(true, driverElement(amazonPageObject.aboutThisItem).isDisplayed());
		driver.quit();

	}

}
