package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {

	
	    private WebDriver driver;
	    private By usernameField = By.id("input-email");
	    private By passwordField = By.id("input-password");
	    private By loginButton = (By.xpath("//input[@value = 'Login']"));

	    public UserPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void openLoginPage(String url) {
	        driver.get(url);
	    }

	    public void enterUsername(String username) {
	        driver.findElement(usernameField).sendKeys(username);
	    }

	    public void enterPassword(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }
	}
