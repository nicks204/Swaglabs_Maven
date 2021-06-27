package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import test.Baseclass;


public class LoginPage {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@FindBy(xpath="//input[@id='user-name']")
    WebElement UserName;
    
    @FindBy(xpath="//input[@id='password']")
    WebElement Password;
    
    @FindBy(xpath= "//input[@id='login-button']")
    WebElement Login;
	    
	    
	public LoginPage() {
		
		driver = Baseclass.driver;
		report = Baseclass.report;
		test = Baseclass.test;
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String uname, String password) {
		
		UserName.sendKeys(uname);
		Password.sendKeys(password);
		Login.click();
		
	}

}
