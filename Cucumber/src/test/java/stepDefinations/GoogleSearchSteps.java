package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps 
{
	WebDriver driver =null;

	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("Inside step- Browser is open");
	    String projectPath= System.getProperty("user.dir");
	    System.out.println(projectPath);
	    System.setProperty("webdriver.chrome.driver",
	    		projectPath+ "\\Driver\\chromedriver.exe");
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("Inside step- user is on google search page");
		driver.navigate().to("https://www.google.ca/");
	}

	@When("user enters a test in search box")
	public void user_enters_a_test_in_search_box() throws InterruptedException {
		System.out.println("Inside step- user enters a test in search box");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Automation step by step");  
		Thread.sleep(2000);
	}

	@And("hits enter")
	public void hits_enter() {
		System.out.println("Inside step- hits enter");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() throws InterruptedException {
		System.out.println("Inside step- user is navigated to search results");
		driver.findElement(By.linkText("Online Courses"));
		Thread.sleep(2000);
		driver.quit();
	}
}
