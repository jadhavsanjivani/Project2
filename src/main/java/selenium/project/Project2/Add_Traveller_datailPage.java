package selenium.project.Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Add_Traveller_datailPage 
{
	WebDriver driver;
	@FindBy (xpath = "//input[@placeholder='First name']")
	WebElement fname;
	@FindBy (id = "last-name 0")
	WebElement lname;
	@FindBy (xpath = "//div[@class= 'col-4']")
	WebElement gender;
	@FindBy (xpath = "//li[.='Female']")
	WebElement female;
	@FindBy (xpath = "//div[@class='col-7']")
	WebElement continueto_payment;
	
	
	public void enter_fname()
	{
		fname.sendKeys("Sanji");
		lname.sendKeys("Jadhav");
		gender.click();
		female.click();
		continueto_payment.click();
		
		
	}
	public void testcase11(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Cleartrip | Pay securely"));
		Assert.assertTrue(driver.getTitle().contains("Cleartrip | Pay securely"), "not able to add personal information");
	}
	 public Add_Traveller_datailPage (WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }

}
