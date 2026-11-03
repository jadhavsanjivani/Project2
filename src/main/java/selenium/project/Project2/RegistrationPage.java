package selenium.project.Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegistrationPage 
{
	WebDriver driver;
	
	@FindBy (partialLinkText = "Sign up for one")
	WebElement signup;
	@FindBy(name ="username1")
	WebElement email;
	@FindBy(id = "registerButton")
	WebElement signin_button;
	@FindBy(name = "password")
	WebElement password;
	@FindBy(id = "profile_title")
	WebElement title;
	@FindBy (name = "first_name")
	WebElement fname;
	@FindBy (name = "last_name")
	WebElement lname;
	@FindBy (id = "country_code")
	WebElement countrycode;
	@FindBy (name = "phone_number_value")
	WebElement phone_no;
	@FindBy (id = "signUpButton")
	WebElement create_button;
	
	
	public void signup(WebDriver driver)
	{
		driver.get("https://www.cleartrip.qa/signinstatic/");
		signup.click();
		email.sendKeys("sanjijadhav2"+Math.random()+"@gmail.com");
		signin_button.click();
		password.sendKeys("Sanji@v16");
		Select s1 = new Select(title);
		s1.selectByValue("Ms");
		fname.sendKeys("Sanji");
		lname.sendKeys("Jadhav");
		Select s2 = new Select(countrycode);
		s2.selectByValue("91");
		phone_no.sendKeys("8888994939");
		create_button.click();	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Cleartrip Customer Support & Contact Number | Connect with us on +91 9595333333"));
		Assert.assertTrue(driver.getTitle().contains("Cleartrip Customer Support & Contact Number | Connect with us on +91 9595333333"),"failed to register");
		
		
	}
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	

}
