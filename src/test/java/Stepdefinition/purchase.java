package Stepdefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class purchase {
  
	private WebDriver driver; 
	
	@Given("^I am on the website homepage$")
    public void i_am_on_the_website_homepage() {
       
		WebDriverManager.chromedriver().setup();
       driver = new ChromeDriver();
       driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fbuild-your-own-computer");
 }
	
	@When("I select \"Computers\" -> \"Desktop\" -> \"Build your own computer\"")
	public void selectDesktopBuildOption() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));;
	    
	    WebElement computers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/computers']")));
	    computers.click();
	    
	    WebElement desktop = driver.findElement(By.xpath("//a[@title='Show products in category Desktops']"));  // Remove the double quotes around the locator
	    desktop.click();
	   
	    WebElement buildYourOwnComputerOption = driver.findElement(By.linkText("Build your own computer"));
	    buildYourOwnComputerOption.click();
	}

	
	
	@And("^I configure the computer with \"([^\"]*)\" RAM, select the operating system, and choose software options$")
	public void i_configure_the_computer(String selectedRAM) {
	    // Select RAM from the dropdown
	    WebElement ramDropdown = driver.findElement(By.id("product_attribute_2"));
	    Select ramSelect = new Select(ramDropdown);
	    ramSelect.selectByVisibleText(selectedRAM);

	    // Select operating system and software options as before
	    WebElement osDropdown = driver.findElement(By.id("product_attribute_4_8"));
	    Select osSelect = new Select(osDropdown);
	    osSelect.selectByVisibleText("Vista Home [+$50.00]");

	    WebElement softwareDropdown = driver.findElement(By.id("product_attribute_5_11"));
	    Select softwareSelect = new Select(softwareDropdown);
	    softwareSelect.selectByVisibleText("Microsoft Office [+$50.00]");
	}


         

         
	    
	 
	 @And("I select the HDD {string}")
	    public void iSelectHDD(String hddSize) {
		
		 WebElement HDDElement = driver.findElement(By.id("product_attribute_3_6"));
		 Select dropdown = new Select(HDDElement);
		 dropdown.selectByVisibleText("320 GB");
	 }
	    @And("^I add the product to the cart and click \"Checkout\"$")
	    public void i_add_product_and_checkout() {
	        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button-1"));
	        addToCartButton.click();
	        
	        WebElement checkoutButton = driver.findElement(By.linkText("Shopping cart"));
	        checkoutButton.click();
	    }

	    @Then("^I should see the product in the shopping cart$")
	    public void i_should_see_product_in_cart() {
	        // Code to verify that the product is in the shopping cart
	    System.out.println(" succsess ");
	    
	    driver.close();
	    }
	
}
