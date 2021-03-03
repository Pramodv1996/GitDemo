package Base;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class base {
	public static Properties prop;

	public static WebDriver driver;
	public static WebDriverWait wait;
	public static int waitTime =5;

	public static WebDriver getDriver() throws IOException, InterruptedException {
		prop = new Properties();
		FileInputStream file = new FileInputStream(
				"C:\\Users\\svavv\\Selenium Projects Test\\Rahul\\Configuration\\config.properties");
		prop.load(file);
		System.setProperty("webdriver.chrome.silentOutput", "true");
		System.setProperty("webdriver.chrome.driver", "D:\\Pramod selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("URL"));
		
	/*	String nodeURl="https://192.168.1.164:4444/wd/hub";
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		 
		 driver = new RemoteWebDriver(new URL(nodeURl), cap);
		 
		 driver.navigate().to(nodeURl);*/
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, waitTime);
		return driver;
	}

}
