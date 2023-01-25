package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import abstractComponents.AbstractComponents;

public class MyCartPage extends AbstractComponents{
	
	WebDriver driver;
	
	public MyCartPage(WebDriver driver) {
		//initialization code
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="button-panel1079")
	WebElement proceedToCheckOutButton;
	
	@FindBy(css="iframe[src*='secure.opinionlab.com']")
	WebElement frameWindow;
	
	@FindBy(css=".close-modal")
	WebElement surveyPopUpExit;
	
		public void proceedToCheckOut() {
		
			proceedToCheckOutButton.click();
			if(frameWindow!=null) {
					driver.switchTo().frame(frameWindow);
					surveyPopUpExit.click();
					driver.switchTo().defaultContent();
				
			}
			else if(surveyPopUpExit!=null) {
				surveyPopUpExit.click();
			}
			
			else {
				System.out.println("no popup present");
			}
			
	}
}
