package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelExecution {

	@Test
	public void Testcase1() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.simplilearn.com");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		Thread.sleep(5000);	
		driver.quit();
	}
	
	
	@Test
	public void Testcase2() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "geckodriver");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		Thread.sleep(5000);	
		driver.quit();

		
	}

	@Test
	public void Testcase3() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.guru99.com/software-testing.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);

		Thread.sleep(15000);	
		driver.quit();

		
	}

	
}
