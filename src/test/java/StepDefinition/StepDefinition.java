package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddToCartPage;
import pageObjects.CheckOutPage;
import pageObjects.MyCartPage;
import pageObjects.ProductPage;
import pageObjects.SearchPage;

public class StepDefinition {

	public void orderPlacement() throws InterruptedException {
		// TODO Auto-generated method stub
		String userText="womens dress";
		WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		SearchPage searchpage=new SearchPage(driver);
		searchpage.goToUrl();
		searchpage.SearchFunc(userText);
System.out.println("hello");
		searchpage.waitPeriod();

		
		ProductPage productPage=new ProductPage(driver);
		productPage.scrollPageDown(); 
		productPage.product();
		
		
		AddToCartPage addToCartPage=new AddToCartPage(driver);
		addToCartPage.scrollPageDown();
		addToCartPage.addTocart();
		
		MyCartPage myCartPage=new MyCartPage(driver);
		myCartPage.waitPeriod();
		myCartPage.proceedToCheckOut();
		
		CheckOutPage  checkOutPage=new CheckOutPage(driver);
		checkOutPage.userDetails("Jancy","Johnson","123456789","jj@gmail.com");
		}

}
