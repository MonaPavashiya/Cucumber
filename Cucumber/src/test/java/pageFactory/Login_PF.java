package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF
{
    WebDriver driver;
	
	public Login_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(name="Submit")
	WebElement login;
	
	@FindBy(id="welcome")
	WebElement wcLink;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	public void enterUserName(String uName) {
		username.sendKeys(uName);
	}

	public void  enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	
	public void clickOnlogin() {
		login.click();
	}
	
	public void clickWelcomeLink() {
		wcLink.click();
	}
	
	public void clickLogout() {
		logout.click();
	}
}
