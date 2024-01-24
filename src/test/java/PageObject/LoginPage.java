package PageObject;
    import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class LoginPage {

		public  WebDriver driver;

	    private By emailField = By.id("Email");
	    private By passwordField = By.id("Password");
	    private By loginButton = By.xpath("//button[@class='button-1 login-button']");

		private By logout;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

          public void enterUserName(String email) {
	        driver.findElement(emailField).sendKeys(email);
	      } 


          public void enterPassword(String password) {
  	        driver.findElement(passwordField).sendKeys(password);
  	    }


	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }
     //  public void clickLogOut() {
    	//   driver.findElement(logout).click();
       }
	



