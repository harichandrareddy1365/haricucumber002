package Stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import PageObject.UserPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserSteps {
	 public WebDriver driver;
	 public UserPage lp ;
	
	
	@Given("user is  on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
       lp = new UserPage(driver); 
	}

    @When("the user enters the username as {string} and the password as {string}")
    public void enterUsernameAndPassword(String username, String password) {
        lp.enterUsername(username);
        lp.enterPassword(password);
    }

    @When("the user clicks on the Login button")
    public void clickLoginButton() {
        lp.clickLoginButton();
    }

    @Then("the user is navigated to the home page")
    public void verifyHomePageNavigation() {
        HomePage homePage = new HomePage(driver);
       String welcomeMessage = homePage.getWelcomeMessage();
        if (welcomeMessage.contains("Welcome to Your Store")) {
            System.out.println("Login successful. Navigated to the home page.");
        } else {
            System.out.println("Login failed.");
        }
        driver.quit();
        
        
    }

}