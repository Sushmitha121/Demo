package computers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericLibrary.Base_Class;
import genericLibrary.ExcelUtil;
import genericLibrary.JavaScriptUtil;
import pomRepository.Jewelry_Page;

public class TC_JW_19_Test extends Base_Class{
	
	@Test
	public void sample()  {
		ExcelUtil exelutility=new ExcelUtil();
		String shoppingTitle=exelutility.readStringDataFromExcel("Sheet1", 6,0);
		
		Jewelry_Page s1 = new Jewelry_Page(driver);
		s1.getClickOnJewelry().click();
		 WebElement View=driver.findElement(By.id("products-viewmode"));
	        Select select2 = new Select(View);
			select2.selectByVisibleText("List");
			
        s1.getCreateYourOwnJewe().click();
        ExcelUtil ele = new ExcelUtil();
		double length = ele.readNumberDataFromExcel("sheet1", 0, 0);
		s1.getTextBox1().sendKeys(""+length);
		
        s1.getShoppingCart().click();
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			 
			e.printStackTrace();
		}
       explicitWait.until(ExpectedConditions.elementToBeClickable(s1.getEditOption()));
        s1.getEditOption().click();
      // explicitWait.until(ExpectedConditions.elementToBeClickable(s1.getEditOption()));
        ExcelUtil ele1 = new ExcelUtil();
		double length1 = ele1.readNumberDataFromExcel("sheet1", 1, 0);
		s1.getNewLength().sendKeys(""+length1);
       //.getNewLength().sendKeys("58cm");
        s1.getUpdateOption().click();
      
        s1.getCloseIcon().click();
        explicitWait.until(ExpectedConditions.elementToBeClickable(s1.getSecondShoppingCart()));
        
        
        Assert.assertEquals( driver.getTitle(),shoppingTitle,"shopping cart page is not displayed");
		Reporter.log( "shopping cart page is displayed",true);
	    
        s1.getSecondShoppingCart().click();
        Reporter.log("Jewelary is added to cart Successfully",true);
        
        
        s1.getCheckBox().click();
        s1.getUpdateShoppingCart().click();
        Reporter.log("your shopping cart is empty",true);
	
}
}
