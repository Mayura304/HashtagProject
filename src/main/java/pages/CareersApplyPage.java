package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareersApplyPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@name='name']") WebElement Name;
	@FindBy(xpath="//*[@name='email']") WebElement Email;
	@FindBy(xpath="//*[@name='phone']") WebElement Phone;
	@FindBy(xpath="//*[@name='notice_time']") WebElement Notice_Period;
	@FindBy(xpath="//*[@name='experience']") WebElement Experience;
	@FindBy(xpath="//*[@id='inputFile']") WebElement Resume;
	@FindBy(xpath="(//*[@name='description'])[2]") WebElement Description;
	@FindBy(xpath="//*[text()='APPLY NOW']") WebElement Apply_Now;
	
	public CareersApplyPage(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void joinUs(String name, String email, String phone, String notice_period, String experience, String description) throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		Name.sendKeys(name);
		Email.sendKeys(email);
		Phone.sendKeys(phone);
		Notice_Period.sendKeys(notice_period);
		Experience.sendKeys(experience);
		String project_path = System.getProperty("user.dir");
		Resume.sendKeys(project_path+"\\testsdata\\resume.pdf");
		Description.sendKeys(description);
		Thread.sleep(3000);
		Apply_Now.submit();
	}

	

}
