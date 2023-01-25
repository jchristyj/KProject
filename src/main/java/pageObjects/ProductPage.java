package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class ProductPage extends AbstractComponents{
	
	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		//initialization code
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css="p[rel*='prd-5570619']")
	WebElement secondProductDisplayed;
	
	By secondProductDisplayedBy =By.cssSelector("p[rel*='prd-5570619']");
	
	public void product() {
		waitUntilElementIsVisible(secondProductDisplayedBy);
		secondProductDisplayed.click();
}
}
