package selenium.project.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(selenium.project.Project2.Listeners_Program.class)
public class TestCase6 extends Launch_Quit
{
		@Test(retryAnalyzer = selenium.project.Project2.IRetry_Logic.class)
		public void economy_class() throws InterruptedException
		{
			HomePage hp = new HomePage(driver);
			hp.economy_class();
			hp.select_wherefrom();
			hp.select_bangalore();
			hp.select_where_to();
			hp.select_mumbai();
			hp.select_date();
			hp.search();
			hp.price();
			hp.testcase4(driver);
			driver.navigate().back();
		//	hp.testcase4(driver);
			
			//HomePage hp = new HomePage(driver);
			hp.economy_class();
			hp.premium_economy();
			hp.select_wherefrom();
			hp.select_bangalore();
			hp.select_where_to();
			hp.select_mumbai();
			hp.select_date();
			hp.search();
			hp.price();
			hp.testcase4(driver);
			driver.navigate().back();
		
			
		//	HomePage hp = new HomePage(driver);
			hp.economy_class();
			hp.business_class();
			hp.select_wherefrom();
			hp.select_bangalore();
			hp.select_where_to();
			hp.select_mumbai();
			hp.select_date();
			hp.search();
			hp.price();
			hp.testcase4(driver);
		//	hp.testcase4(driver);
			
		}

}
