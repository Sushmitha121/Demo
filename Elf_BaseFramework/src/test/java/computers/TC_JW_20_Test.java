package computers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.Jewelry_Page;

public class TC_JW_20_Test extends Base_Class{
	@Test
	public void sample()  {
		ExcelUtil exelutility=new ExcelUtil();
		String newsellar=exelutility.readStringDataFromExcel("Sheet1", 7,0);
		
	Jewelry_Page s2 = new Jewelry_Page(driver);
	s2.getClickOnJewelry().click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,300)");
	Actions action=new Actions(driver);
	WebElement store = driver.findElement(By.xpath("//input[@name='NewsletterEmail']"));
	store.sendKeys("admin987@gmail.com");
	s2.getSubscribe().click();
	Assert.assertEquals( driver.getTitle(),newsellar," sellar page is not displayed");
	Reporter.log( "sellar page is displayed",true);
    
	
	js.executeScript("window.scrollBy(0,-300)");
	 Reporter.log("Thank you for signing up! A verification email has been sent. We appreciate your interest.",true);
	
}
}
