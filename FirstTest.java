package prctic.Batch_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	@Test
	public void MyFirstTest() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// create a chromeDriver object named driver.
		WebDriver driver = new ChromeDriver();

		// go to google web page
		driver.get("https://www.google.com");
		// Maximize the browser window
		driver.manage().window().maximize();

		// wait for 5 seconds
		Thread.sleep(5000);

		// close the browser all active window
		driver.quit();
	}
}
