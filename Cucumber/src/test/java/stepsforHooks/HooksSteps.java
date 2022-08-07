package stepsforHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.*;

public class HooksSteps {
	WebDriver driver;

	@Before(order = 0)
	public void broweserSetUp() {
		System.out.println("I am inside before scenario...");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mS\\Documents\\Mona_Practice_QA\\Cucumber\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Before(order = 1)
	public void broweserSetUp2() {
		System.out.println("I am inside broweserSetUp2...");
	}

	@BeforeStep
	public void beforeSteps() {
		System.out.println("I am inside before steps.....");
	}
	
	@AfterStep
	public void afterSteps() {
		System.out.println("I am inside after steps....");
	}
	@Given("user is on login pageee")
	public void user_is_on_login_pageee() {
		
	}

	@When("user enterssss valid username and password")
	public void user_enterssss_valid_username_and_password() {
	    
	}

	@When("clicking on login buttonnnn")
	public void clicking_on_login_buttonnnn() {
	    
	}

	@Then("user is navigated to the home pageeee")
	public void user_is_navigated_to_the_home_pageeee() {
	    
	}
	@After(order = 1)
	public void closeBrowser() {
		System.out.println("I am inside after scenario...");
		driver.quit();
	}
	@After(order = 2)
	public void closeBrowser2() {
		System.out.println("I am inside closeBrowser2...");
	}
		

}
