package basePack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public static WebDriver driver;
		
		public static void browserLaunch() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}

		public void urlGet(String url) {
			driver.get(url);
		}
		
		public void typeText(WebElement element,String text) {
			element.sendKeys(text);
		}
		
		public void elementClick(WebElement element) {
			element.click();
		}
		
		public String pro(String key) {
			File file = new File("C:\\Users\\jacki\\eclipse-workspace\\April 2024\\OrngHRM\\src\\test\\resources\\login.properties");
			FileInputStream fo = null;
			try {
				fo = new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Properties po = new Properties();
			try {
				po.load(fo);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String property = po.getProperty(key);
			return property;
		}
		
		public void verifyUserName(WebElement element) {
			String text = element.getText();
			if(text.equals("manda user")) {
				System.out.println("you are in home Page");
			}
		}

}
