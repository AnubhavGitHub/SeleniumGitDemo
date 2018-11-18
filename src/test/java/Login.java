import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * 
 */

/**
 * @author Anubhav
 *
 */
public class Login {
	
	WebDriver driver;
	@BeforeSuite
	public void setUp()
	{
	 System.setProperty("webdriver.chrome.driver", "F:\\SeleniumJarFiles\\chromedriver_win32\\chromedriver.exe");	
	 driver=new ChromeDriver();	
	}
	
	@Test
	public void google()
	{
		driver.get("https://www.google.com/");
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
