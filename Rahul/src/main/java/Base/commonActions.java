package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class commonActions extends base{
	static int waitTime;
	public WebDriver driver;
	public static WebDriverWait wait;
	
	public commonActions(WebDriver driver) {
		this.driver=driver;
    wait=new WebDriverWait(driver,waitTime);
	
}
	
	
	

}
