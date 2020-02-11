package mycode;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BrowserInitialize {
public static ChromeDriver driver;

	@BeforeTest(enabled=false)
	public static void chrome()
	{	
    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    driver = new ChromeDriver();
    System.out.println("Browser opened");
    driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    driver.get("https://www.google.co.in");
	}
	
	@DataProvider(name = "Testdata")
	public Object[][] getData() throws IOException {
		System.out.println("Opening Excel sheet...");
		return ReadXL.readxl();
	}
	
	
}
