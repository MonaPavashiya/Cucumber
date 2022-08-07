package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		
		this.driver = driver;
	}

	 By username = By.xpath("//input[@id='txtUsername']"); 
	 By password =By.xpath("//input[@id='txtPassword']"); 
	 By loginButton =By.xpath("//input[@name='Submit']");
	 By welcomeLink = By.xpath("//a[@id='welcome']");
	 By logoutLink = By.xpath("//*[@id='welcome-menu']/ul/li[3]/a");
	
	public void typeUserName(String uName) {
		driver.findElement(username).sendKeys(uName);
	}

	public void typePassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void clickOnLoginbutton() {
		driver.findElement(loginButton).click();
	}

	public void clickOnWelcomeLink() {
		driver.findElement(welcomeLink).click();
	}

	public void clickOnLogOutLink() {
	    driver.findElement(logoutLink).click();
	}

}
