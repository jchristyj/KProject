package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class AddToCartPage extends AbstractComponents{
	
	WebDriver driver;
	
	public AddToCartPage(WebDriver driver) {
		//initialization code
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@class='pdp-addtobag']")
	WebElement addToCartButton;
	
	By addToCartButtonBy =By.xpath("//input[@class='pdp-addtobag']");
	
	@FindBy(css=".btn-primary")
	WebElement proceedToCartPopUp;
	
	By proceedToCartPopUpBy =By.cssSelector(".btn-primary");
	
	public void addTocart() {
		
		waitUntilElementIsVisible(addToCartButtonBy);
		addToCartButton.click();
		waitUntilElementIsVisible(proceedToCartPopUpBy);
		proceedToCartPopUp.click();
	
	}
}
