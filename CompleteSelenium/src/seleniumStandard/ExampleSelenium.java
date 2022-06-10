package seleniumStandard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleSelenium {
	
	WebDriver driver;
	
	@BeforeSuite
	public void doSetup() {
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chromeOptions);
		
	}
	
	@Test
	public void doTestCase01() {
		
		System.out.println("Executing selenium");
		
		driver.get("https://www.shipmentlink.com");
	}

}
