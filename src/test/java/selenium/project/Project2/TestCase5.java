package selenium.project.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(selenium.project.Project2.Listeners_Program.class)
public class TestCase5 extends Launch_Quit
{       
	   @Test(retryAnalyzer = selenium.project.Project2.IRetry_Logic.class)
		public void roundtrip_flight() throws InterruptedException
		{
			HomePage hp = new HomePage(driver);
			hp.select_roundtrip();
			hp.select_wherefrom();
			hp.select_bangalore();
			hp.select_where_to();
			hp.select_mumbai();
			hp.select_date();
			hp.select_date2(driver);
			hp.search();
			hp.testcase5(driver);
		}

}
