package org.login;

import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JunitFramework {
	static WebDriver driver;

	@BeforeClass
	public static void browserLaunch() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@Before
	public void timeBeforeCredentials() {
		// to find time
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc() {
		driver.findElement(By.id("email")).sendKeys("Poova@11");
		driver.findElement(By.id("pass")).sendKeys("9787490557");
		driver.findElement(By.name("login")).click();

	}

	@After
	public void afterTimeCredentials() {
		Date d1 = new Date();
		System.out.println(d1);

	}

	public static void closingBrowser() {
		driver.close();
	}

}
