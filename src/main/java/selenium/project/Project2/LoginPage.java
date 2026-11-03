package selenium.project.Project2;

import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends DDT_program
{
	WebDriver driver;
	@FindBy (name = "email")
	WebElement un;
	@FindBy (name = "password")
	WebElement pwd;
	@FindBy (id = "signInButton")
	WebElement signin_button;
	@FindBy (id = "errors1")
	WebElement error;
	@FindBy (xpath = "(//div[@class='sc-aXZVg iNidEX flex flex-middle'])[1]")
	WebElement signin;
	@FindBy (id = "mobile")
	WebElement mob_no;
	@FindBy (xpath = "//span[.='Get OTP']")
	WebElement otp;
	@FindBy (xpath = "//input [@class = 'otpBox otpSelected']")
	WebElement enter_otp;
	
	public void valid_login(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		driver.get("https://www.cleartrip.com");
		//valid_cred();
		//un.sendKeys(username);
		//pwd.sendKeys(pass);
		//signin_button.click();
		signin.click();
		mob_no.sendKeys("9356954669");
		//otp.click();
		Scanner s1 = new Scanner(System.in);
	    String otp1 = s1.next();
		enter_otp.sendKeys(otp1);
		Assert.assertTrue(driver.getTitle().contains("Cleartrip: #1 Site for Booking Flights Tickets & Hotels Online - Get Best Travel Deals"), "failed to login");
		
		
		
	}
	public void invalid_login(WebDriver driver) throws EncryptedDocumentException, IOException
	{
		driver.get("https://www.cleartrip.com/signinstatic/");
		invalid_cred();
		un.sendKeys(username);
		pwd.sendKeys(pass);
		signin_button.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("errors1")));
		Assert.assertTrue(error.isDisplayed(), "login with invalid data");
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}
