package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="Log out") private WebElement logoutButton;
	
	@FindBy(partialLinkText="Jewelry_Page") private WebElement JewelryModuleLink;

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public WebElement getjewelleryModuleLink() {
		return JewelryModuleLink;
	}

	// Business Logic or Action methods or Behavior
	public void logout() {
		logoutButton.click();
	}

	

	}

	
	

