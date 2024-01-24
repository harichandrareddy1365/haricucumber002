package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.LoginPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class steps {
	
	 public WebDriver driver;
	 public LoginPage lp ;
	
	
	@Given("User Lanuch Chrome browser")
	public void user_lanuch_chrome_browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
       lp = new LoginPage(driver); 
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
	   lp.enterPassword(password);
	   lp.enterUserName(email);
	}


	@When("Click on login")
	public void click_on_login() {
	    // Assuming lp is an instance of LoginPage class
	    lp.clickLoginButton();
	}

	@Then("Page Title Shouid be {string}")
	public void page_title_shouid_be(String title) {
	    driver.getTitle();
	    
	}
	@When("User click on Logout link")
	public void user_click_on_logout_link() throws InterruptedException {
	   lp.clickLoginButton();
	   Thread.sleep(3000);
	}



	@Then("close browser")
	public void close_browser() {
	    driver.close();
	}


}
