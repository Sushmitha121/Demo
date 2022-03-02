//package pomRepository;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class EditandRemove {
//	public EditandRemove(WebDriver driver) {
//		PageFactory.initElements(driver,this);
//	}
//	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a") private WebElement ClickOnJewelry;
//	public WebElement getClickOnJewelry() {
//		return ClickOnJewelry;
//	}
//	public void setClickOnJewelry(WebElement clickOnJewelry) {
//		ClickOnJewelry = clickOnJewelry;
//	}
//	@FindBy(id="products-viewmode") private WebElement ClickOnViewAs;
//	public WebElement getClickOnViewAs() {
//		return ClickOnViewAs;
//	}
//	public void setClickOnViewAs(WebElement clickOnViewAs) {
//		ClickOnViewAs = clickOnViewAs;
//	}
//	@FindBy(xpath="//input[@value='Add to cart']/../../..//a[text()='Create Your Own Jewelry_Page']")private WebElement CreateYourOwnJewe;
//	public WebElement getCreateYourOwnJewe() {
//		return CreateYourOwnJewe;
//	}
//	public void setCreateYourOwnJewe(WebElement createYourOwnJewe) {
//		CreateYourOwnJewe = createYourOwnJewe;
//	}
//	@FindBy(id="product_attribute_71_10_16")private WebElement TextBox;
//	public WebElement getTextBox() {
//		return TextBox;
//	}
//	public void setTextBox(WebElement textBox) {
//		TextBox = textBox;
//	}
//	
//	
//
//}
