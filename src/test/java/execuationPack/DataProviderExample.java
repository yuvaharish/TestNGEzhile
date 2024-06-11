package execuationPack;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.concurrent.TimeUnit;

import javax.swing.text.DateFormatter;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	WebDriver driver;
	
	
	public String[][] loginDataProvider() {
		String[][] data= {
				{"admin","admin12"},
				{"admin","admin"},
				{"Admin","admin"},
				{"Admin","admin123"}};
		return data;
	}
	
	@DataProvider(name="loginData")
	public static String[][] excel() throws IOException {
		File file = new File("C:\\Users\\jacki\\OneDrive\\Desktop\\Attendance Tracker.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		int noofRow = sheet.getPhysicalNumberOfRows();
		int noofcolum = sheet.getRow(0).getLastCellNum();
		String [][] data= new String[noofRow][noofcolum];
		for (int i = 0; i < noofRow; i++) {
			for (int j = 0; j < noofcolum; j++) {
				DataFormatter df = new DataFormatter();
				 data [i][j] = df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		
		return data;
	}
	
	
	@BeforeSuite
	public void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\jacki\\Downloads\\Compressed\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Test(dataProvider = "loginData")
	public void orngHRM(String uName,String pWord) {
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		WebElement userName = driver.findElement(By.name("username"));
		userName.sendKeys(uName);
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys(pWord);
		
		WebElement loginbtn = driver.findElement(By.cssSelector(".oxd-button"));
		loginbtn.click();
	}
	
	
	public void closeBr() {
		driver.close();
	}

	
}
