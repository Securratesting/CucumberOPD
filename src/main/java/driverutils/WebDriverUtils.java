package driverutils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtils {
	public static WebDriver driver;
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
	     driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opd-dev.azurewebsites.net/");
	    return driver;
	}
}


		


