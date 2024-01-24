package Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class register {
	
	private WebDriver driver;
	
	@Given("I am navigate to the registration page")
	public void i_am_navigate_to_the_registration_page() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	driver.manage().window().maximize();
	}

	@When("I enter my First Name as {string}")
	public void i_enter_my_first_name_as(String firstName) {
	 WebElement FirstName = driver.findElement(By.id("input-firstname"));
	 FirstName.sendKeys("Hari");
	   
	}

	@When("I enter my Last Name as {string}")
	public void i_enter_my_last_name_as(String lastname) {
		WebElement LastName = driver.findElement(By.id("input-lastname"));
	    LastName.sendKeys("Anugu");   
	}

	@When("I enter my E-Mail as {string}")
	public void i_enter_my_e_mail_as(String email) {
	    WebElement Email =driver.findElement(By.id("input-email"));
	   Email.sendKeys("harichandrareddy1365@gmail.com");
	}

	@When("I enter my Telephone as {string}")
	public void i_enter_my_telephone_as(String string) {
		WebElement Telephone = driver.findElement(By.name("telephone"));
	Telephone.sendKeys("123645697");
	}

	@When("I enter my Password as {string}")
	public void i_enter_my_password_as(String string) {
		 WebElement Password = driver.findElement(By.id("input-password"));
	Password.sendKeys("Hari@123");
	}
	

	@When("I confirm my Password as {string}")
	public void i_confirm_my_password_as(String string) {
		 WebElement ConfirmPassword = driver.findElement(By.id("input-confirm"));
	ConfirmPassword.sendKeys("Hari@123");
	}
	

	@When("I choose to subscribe with {string}")
	public void i_choose_to_subscribe_with(String string) {
		WebElement Subscrib = driver.findElement(By.className("radio-inline"));
	    Subscrib.click();
	}

	@When("I agree to the Privacy Policy")
	public void i_agree_to_the_privacy_policy() {
		WebElement PrivacyPolicy = driver.findElement(By.name("agree"));
	    PrivacyPolicy.click();
	}

	@When("I click on the Submit button")
	public void i_click_on_the_submit_button() {
		WebElement Continue = driver.findElement(By.xpath("//input[@class = 'btn btn-primary']"));
	     Continue.click();
	

	 if (Continue.equals("Login successful!")) {
    	 
   	  System.out.println("Login successful! Message: " + "successful");
   	    
   	} else {
   		
   	    System.out.println("Login failed! Message: " + "fail");
   	}
    driver.close();
	     
	    
	}

}
