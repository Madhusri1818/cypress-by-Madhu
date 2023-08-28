package StepDefinition;

import com.DriverFactory.BaseDriver;
import com.WebElements.ActiTimepage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginactStep extends BaseDriver{
	public ActiTimepage element = new ActiTimepage(driver);
	@When("Enter  the data {string} and {string}")
	public void enter_the_data_and(String string, String string2) {
		System.out.println("user enters");
		element.LoginFunction(string, string2);
	}

	@When("user click Login link")
	public void user_click_login_link() {
element.login_btn.click();	}

	@Then("logout the app")
	public void logout_the_app() throws Exception {
		element.ValidateLogo();
		Thread.sleep(2000);
		element.Logout();
	}

}
