package hello_world;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	WebDriver driver;
	@Test
	public void test1() {
		driver=new ChromeDriver();
		driver.get("https:/www.Google.com/");
	}

}
