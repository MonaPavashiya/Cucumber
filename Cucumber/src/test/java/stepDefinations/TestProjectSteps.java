package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class TestProjectSteps
{
	WebDriver driver =null;
	
	@Given("browser is now open")
	public void browser_is_now_open() {
	    System.out.println("Inside step- Browser is open");
	    String projectPath= System.getProperty("user.dir");
	    System.out.println(projectPath);
	    System.setProperty("webdriver.chrome.driver",
	    		projectPath+ "\\Driver\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	}
	
	@And("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://example.testproject.io/web/");
		
	    
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password){
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
	    
	}
	

	@And("user clicks on login")
	public void user_clicks_on_login() {
		driver.findElement(By.id("login")).click();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.quit();
	    
	}

	


}
