package hello_world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test1 {

	WebDriver driver;
	@Test
	@Parameters("browser")
	public void VerifyPageTitle(String browserName) throws Exception {
		if(browserName.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(5000);
		driver.quit();
	}

}
