package stepDefinations;

import java.time.Duration;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class OrangeHrmSteps {

	WebDriver driver;
	LoginPage login;

	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		String projectPath = System.getProperty("user.dir");
		System.out.println(projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath + "\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@When("user opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	}

	@When("user entering Username as {string} and Password as {string}")
	public void user_entering_username_as_and_password_as(String username, String password) {
		login = new LoginPage(driver);
		login.typeUserName(username);
		login.typePassword(password);
		
		//driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		//driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	}

	@When("click on login")
	public void click_on_login() {
		login.clickOnLoginbutton();
		//driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {

		if (driver.getPageSource().contains("Invalid credentials")) {
			driver.quit();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
	}

	@When("user clicks on Welcome link")
	public void user_clicks_on_welcome_link() {
		login.clickOnWelcomeLink();
		//driver.findElement(By.xpath("//a[@id='welcome']")).click();
	}

	@Then("User clicks on logout link")
	public void user_clicks_on_logout_link() {
		login.clickOnLogOutLink();
		//driver.findElement(By.linkText("Logout")).click();
	}

	@Then("user close browser")
	public void user_close_browser() {
		driver.quit();
	}

}
