package selenium.project.Project2;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Launch_Quit extends Listeners_Program
{
	

	@BeforeMethod
	@Parameters("browser")
	public void launch(String browser)
	{
		if (browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.cleartrip.com");
			//driver.get("https://www.cleartrip.qa/");
		driver.navigate().refresh();
	}
	
	@AfterMethod
	public void quit() throws InterruptedException
	{
		
		driver.quit();
	}

}
