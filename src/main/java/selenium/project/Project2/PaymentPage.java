package selenium.project.Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class PaymentPage 
{
	WebDriver driver;
	@FindBy (xpath = "(//div[@class='fs-3 c-secondary-500 fw-500'])[1]")
	WebElement credit_card;
	@FindBy (name = "cardNumber")
	WebElement card_number;
	@FindBy (name = "expiryMonth")
	WebElement month;
	@FindBy (name = "expiryYear")
	WebElement year;
	@FindBy (name = "name")
	WebElement name;
	@FindBy (name = "cvv")
	WebElement cvv;
	@FindBy (xpath = "//button[@class='whiteLabel-style bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
	WebElement paynow;
	
	public void select_card(WebDriver driver)
	{
		credit_card.click();
		card_number.sendKeys("5143687330385981");
		Select s1 = new Select(month);
		s1.selectByValue("01");
		Select s2 = new Select(year);
		s2.selectByValue("2029");
		name.sendKeys("Gretta Raya");
		cvv.sendKeys("839");
		paynow.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.titleContains("Payment Page"));
		//Assert.assertTrue(driver.getTitle().contains("Payment Page"), "Payment is failed");
		Assert.assertTrue(paynow.isEnabled(),"Payment is failed");
		
		
	}
	
	public PaymentPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
