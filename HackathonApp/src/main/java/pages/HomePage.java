package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.FirstCryStep;

public class HomePage extends FirstCryStep {

		
	public HomePage(WebDriver driver){
		
		driver= driver;
		PageFactory.initElements(driver, HomePage.class);
		
	}
	
	
	@FindBy(xpath="//a[text()='All Categories']")
	private WebElement categorieslink;
	
	@FindBy(xpath="//a[text()='OFFERS']")
	private WebElement oferslink;
	
	
	@FindBy(xpath="//a[text()=' Health & Safety']")
	private WebElement hlthandsfty;
	
	@FindBy(xpath="(//a[text()='Runbugz Mosquito Repellent Patches - 30 Patches'])")
	private WebElement firstItmName;
	
	@FindBy(xpath="(//a[text()='Runbugz Mosquito Repellent Patches - 30 Patches'])")
	private WebElement firstItmName;
	
	
	
	
	public void categoriesLinkBtn() throws InterruptedException{
		
		System.out.println("Hello ....");
		Actions act = new Actions(driver);
		act.moveToElement(categorieslink).build().perform();

		
		//categorieslink.click();
	
	}
	public void offersBut(){
		
		
		
	}
	
	
	
	
}
