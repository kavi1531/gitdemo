package Commonelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	protected WebDriver driver;
	@BeforeTest
	
	
	public void Driverinit ()
	{
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
        

        driver = new ChromeDriver(chromeOptions);
        driver.get("https://www.facebook.com/");
	}
	
	@AfterTest
	
	public void Driverclean()
	{
		driver.close();
	}

}
