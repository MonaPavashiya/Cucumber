package stepDefinations;

import io.cucumber.java.en.*;

public class SingleTag {
	@Given("I navigate to url")
	public void i_navigate_to_url() {
	    System.out.println("Hi");
	}

	@Given("I enter username as {string}")
	public void i_enter_username_as(String string) {
		System.out.println("my");
	}

	@Given("I enter password as {string}")
	public void i_enter_password_as(String string) {
		System.out.println("name");
	}

	@When("I click Login")
	public void i_click_Login() {
		System.out.println("is");
	}

	@Then("I should be logged into the system")
	public void i_should_be_logged_into_the_system() {
		System.out.println("Mona");
	}
	@Given("navigate to url")
	public void navigate_to_url() {
		System.out.println("I");
	}

	@Given("enter username as {string}")
	public void enter_username_as(String string) {
		System.out.println("am");
	}

	@Given("enter password as {string}")
	public void enter_password_as(String string) {
		System.out.println("doing");
	}

	@When("click Login")
	public void click_Login() {
		System.out.println("cucumber");
	}

	@Then("should be logged into the system")
	public void should_be_logged_into_the_system() {
		System.out.println("practice");
	}

	@Given("navigate url")
	public void navigate_url() {
		System.out.println("I");
	}

	@Given("enter uname as {string}")
	public void enter_uname_as(String string) {
		System.out.println("am");
	}

	@Given("enter psword as {string}")
	public void enter_psword_as(String string) {
		System.out.println("having");
	}

	@When("click on Login")
	public void click_on_Login() {
		System.out.println("to much");
	}

	@Then("should log into the system")
	public void should_log_into_the_system() {
		System.out.println("fun");
	}


}
