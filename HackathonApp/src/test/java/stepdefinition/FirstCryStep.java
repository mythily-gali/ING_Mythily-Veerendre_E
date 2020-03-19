package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class FirstCryStep {

	public WebDriver driver=null;;
	
	@Given("^launch the url$")
	public void launch_the_url() throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

	@When("^navigate from the All Categories link$")
	public void navigate_from_the_All_Categories_link() throws InterruptedException {
	    
		HomePage home = new HomePage(driver);
		System.out.println("Heelo");
		home.categoriesLinkBtn();
	}

	@When("^navigate to offers link$")
	public void navigate_to_offers_link() {
	    
		HomePage ofers = PageFactory.initElements(driver,HomePage.class);
		ofers.offersBut();
	}

	@When("^navigate to click on Home and Safety and Toys and Gaming$")
	public void navigate_to_click_on_Home_and_Safety_and_Toys_and_Gaming() {
	    
	}

	@When("^pick anyone and capture price$")
	public void pick_anyone_and_capture_price() {
	    
	}

	@When("^add cart and view cart$")
	public void add_cart_and_view_cart() {
	    
	}

	@When("^validate the assert$")
	public void validate_the_assert() {
	    
	}

	@When("^Enter promo code$")
	public void enter_promo_code() {
	   
	}

	@Then("^revalidate the new price$")
	public void revalidate_the_new_price() {
	    
	}

	

}
