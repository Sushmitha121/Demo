package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jewelry_Page {
	public Jewelry_Page(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[6]/a") private WebElement ClickOnJewelry;
	public WebElement getClickOnJewelry() {
		return ClickOnJewelry;
	}
	public void setClickOnJewelry(WebElement clickOnJewelry) {
		ClickOnJewelry = clickOnJewelry;
	}

	@FindBy(id="products-orderby") private WebElement ClickOnSortBy;
	public WebElement getClickOnSortBy() {
		return ClickOnSortBy;
	}
	public void setClickOnSortBy(WebElement ClickOnSortBy) {
		ClickOnSortBy=ClickOnSortBy;
	}
	@FindBy(id="products-pagesize") private WebElement ClickOnDisplayPage;
	public WebElement getClickOnDisplayPage() {
		return ClickOnDisplayPage;
	}
	@FindBy(id="products-viewmode") private WebElement ClickOnViewAs;

	public WebElement getClickOnViewAs() {
		return ClickOnViewAs;
	}
	public void setClickOnViewAs(WebElement clickOnViewAs) {
		ClickOnViewAs = clickOnViewAs;
	}

	public void setClickOnDisplayPage(WebElement clickOnDisplayPage) {
		ClickOnDisplayPage = clickOnDisplayPage;
	}

	@FindBy(linkText="Create Your Own Jewelry")private WebElement CreateYourOwnJewe;
	public WebElement getCreateYourOwnJewe() {
		return CreateYourOwnJewe;

	}
	public void setCreateYourOwnJewe(WebElement CreateYourOwnJewe) {
		CreateYourOwnJewe=CreateYourOwnJewe;
	}
    @FindBy(xpath="//input[@id='product_attribute_71_10_16']")private WebElement TextBox1;
	public WebElement getTextBox1() {
		return TextBox1;
	}
	public void setTextBox1(WebElement textBox1) {
		TextBox1 = TextBox1;
	}
	@FindBy(xpath="//input[@id='add-to-cart-button-71']")private WebElement Addtocart;
	public WebElement getAddtocart() {
		return Addtocart;
	}
	public void setAddtocart(WebElement Addtocart) {
		Addtocart = Addtocart;
	}
	@FindBy(partialLinkText="Shopping cart")private WebElement ShoppingCart;
	public WebElement getShoppingCart() {
		return ShoppingCart;
	}
	public void setShoppingCart(WebElement shoppingCart) {
		ShoppingCart = ShoppingCart;
	}
	@FindBy(linkText="Edit")private WebElement EditOption;
	public WebElement getEditOption() {
		return EditOption;
	}
	public void setEditOption(WebElement editOption) {
		EditOption = EditOption;
	}
	@FindBy(xpath="//input[@id='product_attribute_71_10_16']")private WebElement NewLength;
	public WebElement getNewLength() {
		return NewLength;
	}
	public void setNewLength(WebElement newLength) {
		NewLength = NewLength;
	}
	@FindBy(id="add-to-cart-button-71")private WebElement UpdateOption;
	public WebElement getUpdateOption() {
		return UpdateOption;
	}
	public void setUpdateOption(WebElement updateOption) {
		UpdateOption = UpdateOption;
	}
	
	@FindBy(xpath = "//span[@title='Close']") private WebElement closeIcon;
	
	
	public WebElement getCloseIcon() {
		return closeIcon;
	}
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']/../../..//span[text()='Shopping cart']")private WebElement SecondShoppingCart;
	public WebElement getSecondShoppingCart() {
		return SecondShoppingCart;
	}
//	public void setSecondShoppingCart(WebElement secondShoppingCart) {
//		SecondShoppingCart = SecondShoppingCart;
//	}
	@FindBy(name="removefromcart")private WebElement CheckBox;
	public WebElement getCheckBox() {
		return CheckBox;
	}
	public void setCheckBox(WebElement checkBox) {
		CheckBox = checkBox;
	}
	@FindBy(xpath="//input[@value='Update shopping cart']")private WebElement UpdateShoppingCart;
	public WebElement getUpdateShoppingCart() {
		return UpdateShoppingCart;
	}
	public void setUpdateShoppingCart(WebElement updateShoppingCart) {
		UpdateShoppingCart = UpdateShoppingCart;
	}
   @FindBy(xpath="//input[@id='newsletter-email']")private WebElement SellarTextBox;
public WebElement getSellarTextBox() {
	return SellarTextBox;
}
public void setSellarTextBox(WebElement sellarTextBox) {
	SellarTextBox = SellarTextBox;

}
@FindBy(xpath="//input[@value='Subscribe']")private WebElement Subscribe;
public WebElement getSubscribe() {
	return Subscribe;
}
public void setSubscribe(WebElement subscribe) {
	Subscribe = Subscribe;
}
public WebElement getTextBox() {
	
	return getTextBox();
}
}













