package Stepdefinition;
    import io.cucumber.java.en.Given;
	import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.cucumber.java.en.Then;
	import io.cucumber.java.en.And;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import static org.junit.Assert.assertEquals;

	public class hlogin {

	    private WebDriver driver;

	    @Given("User is on the login page") 
	    public void userIsOnLoginPage() {
	       
	    	WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	    }

	    @When("User enters valid username and password")
	    public void userEntersValidCredentials() throws InterruptedException {
	        WebElement usernameInput = driver.findElement(By.id("Email"));
	        WebElement passwordInput = driver.findElement(By.id("Password"));

	        usernameInput.sendKeys("harshahari1365@gmail.com");
	        passwordInput.sendKeys("Hari@123");
	        Thread.sleep(5000);
	   driver.manage().window().maximize();
	    }
  
	    @And("clicks on the login button")
	    public void userClicksOnLoginButton() {
	        
	    	// Assuming you have a WebDriver instance named 'driver'
	    	WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
	    	loginButton.click();

	    }
	    @Then("User should be redirected to the home page")
	    public void userIsRedirectedToHomePage() throws InterruptedException {
	        
	        String currentUrl = driver.getCurrentUrl(); 
	        assertEquals("Expected home page URL", "https://demo.nopcommerce.com/login?returnUrl=%2F", currentUrl);
           
	        driver.quit();
	   
	    }
	}

