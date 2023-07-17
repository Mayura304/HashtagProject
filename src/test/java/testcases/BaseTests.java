package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.CareersApplyPage;

public class BaseTests {

	public static WebDriver driver;
	public CareersApplyPage cp;
	
	@BeforeSuite
	public void beforeSuite() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hashtag-ca.com/careers/apply?jobCode=QAE001");
		
	}
	
	@BeforeClass
	public void createObject() {
		
		cp = new CareersApplyPage(driver);
	}
}
