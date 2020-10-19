package webdriverex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class mavenex {

	public static WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\New folder\\chromedriver1.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("way2automation@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("jkdfjkfd");

	}

	@AfterSuite
	public void tearDown() {
		driver.quit();

	}

}
