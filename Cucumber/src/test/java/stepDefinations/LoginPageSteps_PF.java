package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pageFactory.Login_PF;

public class LoginPageSteps_PF {

	WebDriver driver =null;
	Login_PF login;
	
	@Given("browser is opening")
	public void browser_is_opening() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Given("user is on loging page")
	public void user_is_on_loging_page() {
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("^user entering (.*) and (.*)$")
	public void user_entering_username_and_password(String uname, String password) {
	   
	   login = new Login_PF(driver);
		
	   login.enterUserName(uname);
	   login.enterPassword(password);
	}

	@When("user clicking on login button")
	public void user_clicking_on_login_button() {
	    login.clickOnlogin();
	}

	@Then("user click on welcome link on next page")
	public void user_click_on_welcome_link_on_next_page() {
	    login.clickWelcomeLink();
	}

	@Then("user clicks on logout button")
	public void user_clicks_on_logout_button() {
	    login.clickLogout();
	    driver.quit();
	}

	

}
