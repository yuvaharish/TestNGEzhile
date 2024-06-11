package execuationPack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParallelExample {
	
	@Test
	public void flipkart() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.close();
	}

	@Test
	public void amzone() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			driver.close();
	}

	@Test
	public void snapDeal() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://snapdeal.com/");
		driver.close();
	}
	
	@Test
	public void flipkart2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.close();
	}

	@Test
	public void amzone2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			driver.close();
	}

	@Test
	public void snapDeal2() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://snapdeal.com/");
		driver.close();
	}
	

}
