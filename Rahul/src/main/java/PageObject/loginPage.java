package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {

	public loginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		//doubt
	}

	@FindBy(xpath = "/html/body/app-root/div/header/div[1]/div/div/div[2]/div[2]/a")
	WebElement clickOnLogin;
	
	@FindBy(xpath = "//input[@id='user_email']")
	WebElement username;
	
	@FindBy(xpath = "//input[@id='user_password']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='commit']")
	WebElement login;
	
	public WebElement clickOnLogin() {
		return clickOnLogin;
	}
	
	public WebElement username() {
		return username;
	}

	public WebElement password() {
		return password;
	}

	public WebElement login() {
		return login;
	}
		
}
