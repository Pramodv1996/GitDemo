package stepDefinations;

import java.io.IOException;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Base.base;
import PageObject.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class loginStepDef {
	public WebDriver driver;
	loginPage lgp;

	@Given("user try to login with the valid username {string} and invalid Password {string}")
	public void user_try_to_login_with_the_valid_username_and_invalid_password(String string1, String string2)
			throws IOException, InterruptedException {
		driver = base.getDriver();
		lgp = new loginPage(driver);
		lgp.clickOnLogin().click();
		lgp.username().sendKeys(string1);
		lgp.password().sendKeys(string2);
		lgp.login();
	}

	@Then("user should be able to redirected to the appropriate page when clicking on Forgot Password link")
	public void user_should_be_able_to_redirected_to_the_appropriate_page_when_clicking_on_forgot_password_link() {

	}

	@Then("navigate to Gmail with the new window and refresh the mails")
	public void navigate_to_gmail_with_the_new_window_and_refresh_the_mails() {

	}

	@Then("select the proper mail with the title Rahul Shetty having a current date and fetch the OTP")
	public void select_the_proper_mail_with_the_title_rahul_shetty_having_a_current_date_and_fetch_the_otp() {

	}

	@Then("redirect to Rahul Sheety academy and click on submit by giving valid OTP")
	public void redirect_to_rahul_sheety_academy_and_click_on_submit_by_giving_valid_otp() {

	}

	@Then("By giving the new password and Confirm Password user must able to login")
	public void by_giving_the_new_password_and_confirm_password_user_must_able_to_login() {

	}
}