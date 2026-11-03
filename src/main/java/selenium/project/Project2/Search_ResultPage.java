package selenium.project.Project2;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Search_ResultPage
{
	WebDriver driver;
	@FindBy (xpath ="(//button[@class = 'h-10 flex-1 br-8 bg-intlnew-orange bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-1 px-3 h-8 fs-3 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border'] )[3]")              //(//button[.='Book'])[6]
	WebElement book;
	@FindBy (xpath = "(//div[@class = 'flex flex-1 px-0 '])[1]")
	WebElement standard_fare;
	@FindBy (xpath = "//button[@class = 'px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")//button[. = 'Continue']")
	WebElement continue_button;
	@FindBy (xpath = "(//div[@class='br-4 w-100p h-100p flex flex-center flex-middle fw-500 c-pointer'])[32]")                  //div[@data-testid='156']")
	WebElement select_sheat;
	@FindBy (xpath = "(//button[. = 'Continue'])[2]")
	WebElement continue2_button;
	@FindBy (xpath = "//h2[.='Add contact details']")
	WebElement add_contact_details;
	@FindBy (xpath = "(//div[.='Cancellation refund policy'])[3]")
	WebElement cancellation;
	@FindBy (xpath = "(//div[@class = 'insurance-container'])[1]")
	WebElement rules;
	@FindBy (xpath = "//div[@class='ba bc-neutral-100 br-8']")
	WebElement fare;
	@FindBy (xpath = "(//span[@class='apply-button-new'])[1]")
	WebElement apply;
	@FindBy (xpath = "  //button[@class= 'remove-button-alternative p-1 h-0 mr-3 bc-neutral-900 c-neutral-900 bg-transparent c-pointer w-100p py-2 px-4 h-9 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
	WebElement remove;
	
	public void select_book(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(book)); 
		
		book.click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String parent = i1.next();
		String child = i1.next();
		driver.switchTo().window(child);
		Point p1 = standard_fare.getLocation();
		int y = p1.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		standard_fare.click();
	}
	public void click_continue1(WebDriver driver) throws InterruptedException
	{
		Point p1 = continue_button.getLocation();
		int x = p1.getX();
		int y = p1.getY();
		System.out.println(x + "   "+y);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(continue_button)); 
		
		continue_button.click();
		Thread.sleep(5000);
		wait.until(ExpectedConditions.elementToBeClickable(select_sheat)); 
		select_sheat.click();
		
		
	}
	public void click_continue(WebDriver driver) throws InterruptedException
	{
		Point p2 = continue_button.getLocation();
		int x1 = p2.getX();
		int y1 = p2.getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y1+")");
		Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(continue2_button)); 
		continue2_button.click();
	}
	public void add_contact()
	{
		Assert.assertTrue(add_contact_details.isDisplayed());
	}
	public void testcase10()
	{
		Assert.assertTrue(cancellation.isDisplayed());
		Assert.assertTrue(rules.isDisplayed());
		Assert.assertTrue(fare.isDisplayed());
		
	}
	public void apply_coupon()
	{
		apply.click();
		System.out.println(remove.getText());
		Assert.assertTrue(remove.getText().contains("Remove"));
	}
	public Search_ResultPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
