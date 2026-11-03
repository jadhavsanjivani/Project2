package selenium.project.Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Add_Contact_detailPage 
{
	WebDriver driver;
	@FindBy (xpath = "//input[@placeholder='Mobile number']")
	WebElement mobile_no;
	@FindBy (xpath = "//input[@placeholder='Email address']")
	WebElement email;
	@FindBy(xpath = "(//div[@class='d-inline-block'])[2]")
	WebElement continue_button;
	
	
	public void enter_mobile()
	{
		mobile_no.sendKeys("9876543210");
		email.sendKeys("sanjijadhav2@gmail.com");
		continue_button.click();
	}
	
	public Add_Contact_detailPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
