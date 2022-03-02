package computers;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import pomRepository.HomePage;
import org.testng.asserts.*;
import pomRepository.Jewelry_Page;

public class TC_JW_18_Test extends Base_Class {

	@Test
	public void sample() throws InterruptedException {
		ExcelUtil exelutility=new ExcelUtil();
		String homepageTitle=exelutility.readStringDataFromExcel("Sheet1", 3,0);
		Jewelry_Page s1=new Jewelry_Page(driver);
		
		Assert.assertEquals( driver.getTitle(),homepageTitle,"homepage is not displayed");
		Reporter.log( "home page is displayed",true);
	    s1.getClickOnJewelry().click();
		
		WebElement sortBy = driver.findElement(By.id("products-orderby"));
		Select select = new Select(sortBy);
        select.selectByVisibleText("Name: Z to A");
		 
        WebElement Display=driver.findElement(By.id("products-pagesize"));
        Select select1 = new Select(Display);
        select1.selectByVisibleText("4");
        
        WebElement View=driver.findElement(By.id("products-viewmode"));
        Select select2 = new Select(View);
	 	select2.selectByVisibleText("List");
		
		ExcelUtil ele = new ExcelUtil();
		double length = ele.readNumberDataFromExcel("sheet1", 0, 0);
		s1.getCreateYourOwnJewe().sendKeys(""+length);
		
		Reporter.log("tha product has been added to shopping cart successfully");

		}
}




