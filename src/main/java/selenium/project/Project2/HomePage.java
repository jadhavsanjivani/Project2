package selenium.project.Project2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class HomePage 
{
	WebDriver driver;
	@FindBy (xpath = "//input[@placeholder = 'Where from?']")
	WebElement where_from;
	@FindBy (xpath = "(//div[.= 'BLR'])[2]")
	WebElement bangalore;
	@FindBy (xpath = "//input[@placeholder='Where to?']")
	WebElement where_to;
	@FindBy (xpath = "(//div[. = 'BOM'])[2]")
	WebElement mumbai;
	@FindBy (xpath ="(//div[@class='c-inherit flex flex-1 flex-nowrap fs-16 fw-500 card-price'])[3]")
	WebElement calander;
	@FindBy (xpath = "(//div[@class='c-inherit flex flex-1 flex-nowrap fs-16 fw-500 card-price'])[4]")
	WebElement calander2;
	@FindBy (xpath = "(//div[@class= 'DayPicker-Day'])[16]")
	WebElement date;
	@FindBy (xpath = "(//div[@class='DayPicker-Day'])[17]")
	WebElement date2;
	@FindBy (xpath = "//h4[. = 'Search flights']")
	WebElement search_flight;
	@FindBy (xpath = "//span[.='One way']")
	WebElement oneway;
	@FindBy(xpath = "//p[. = 'Round trip']")
	WebElement round_trip;
	@FindBy (xpath = "(//div[@class='flex flex-middle'])[18]")
	WebElement economy_price;
	@FindBy (xpath = "(//button[@class='bn c-pointer'])[1]")
	WebElement adults;
	
	@FindBy (xpath = "(//div[@class='sc-aXZVg iNidEX flex flex-middle'])[2]")
	WebElement economy_class;
	@FindBy(xpath = "//p[.='Business class']")
	WebElement business_class;
	@FindBy (xpath = "//p[.='Premium economy']")
	WebElement premium_economy_class;
	@FindBy (xpath = "//span[@class = 'header-logo flights-logo m-2']")
	WebElement flight_icon;
	@FindBy (xpath = "(//input[@placeholder='Any worldwide city or airport'])[1]")
	WebElement from;
	@FindBy (xpath = "(//input[@placeholder='Any worldwide city or airport'])[2]")
	WebElement to;
	@FindBy (xpath = "//p[. = 'Bangalore, IN - Kempegowda International Airport (BLR)']")
	WebElement blr;
	@FindBy (xpath = "//p[. = 'New Delhi, IN - Indira Gandhi Airport (DEL)']")
	WebElement del;
	@FindBy (xpath = "//button[@class= 'px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
	WebElement search_2;
	@FindBy (xpath = "//button[@class = 'flex flex-middle flex-between t-all fs-2 focus:bc-secondary-500 bg-transparent bc-neutral-100 c-pointer bn p-2 nmx-2 hover:bg-neutral-0 br-4 c-neutral-400 hover:c-secondary-500']")
	WebElement login;
	@FindBy (xpath = "(//div[@class = 'fs-2 c-inherit flex flex-nowrap'])[3]")
	WebElement login1;
	@FindBy (xpath = "//span[.='Sign out']")
	WebElement log_out;
	
	
	public void select_roundtrip()
	{
		oneway.click();
		round_trip.click();
	}
	public void economy_class()
	{
		economy_class.click();		
	}
	public void select_adults()
	{
		adults.click();
	}
	public void price()
	{
		System.out.println(economy_price.getText());
	}
	
	public void business_class()
	{
		business_class.click();
	}
	public void premium_economy()
	{
		premium_economy_class.click();
		
	}
	public void select_wherefrom() throws InterruptedException
	{
		//Thread.sleep(5000);
		where_from.click();
		
	}
	public void select_bangalore() throws InterruptedException
	{
		//Thread.sleep(4000);
		bangalore.click();
	}
	public void select_where_to() throws InterruptedException
	{
		//Thread.sleep(3000);
		where_to.click();
	}
	public void select_mumbai() throws InterruptedException
	{
		//Thread.sleep(5000);
		mumbai.click();
	}
	
	public void select_date() throws InterruptedException
	{
		//Thread.sleep(5000);
		calander.click();
		date.click();
				
	}
	public void select_date2(WebDriver driver) throws InterruptedException
	{
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		/*wait.until(ExpectedConditions.elementToBeClickable(calander2));
		calander2.click();*/
		wait.until(ExpectedConditions.elementToBeClickable(date2));
		date2.click();
				
	}
	public void search() throws InterruptedException
	{
	//	Thread.sleep(5000);
		search_flight.click();
		Thread.sleep(6000);
	}
	public void testcase4(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Cleartrip | Bangalore → Mumbai"));
		Assert.assertTrue(driver.getTitle().contains("Cleartrip | Bangalore → Mumbai"));
	}
	public void testcase5(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Cleartrip | Bangalore ⇄ Mumbai"));
		Assert.assertTrue(driver.getTitle().contains("Cleartrip | Bangalore ⇄ Mumbai"));
	}
	public void testcase7(WebDriver driver)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Cleartrip | Mumbai → Bangalore"));
		Assert.assertTrue(driver.getTitle().contains("Cleartrip | Mumbai → Bangalore"));
	}
	
	public void click_fligh_icon(WebDriver driver) throws InterruptedException
	{
		flight_icon.click();
		from.click();
		blr.click();
		to.click();
		del.click();
		Thread.sleep(3000);
		search_2.click();
		login.click();
		log_out.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath( "(//div[@class = 'fs-2 c-inherit flex flex-nowrap'])[3]")));
		System.out.println(login.getText());
		Assert.assertTrue(login.getText().contains("Your trips"), "Failed to logout");
		
	}
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
