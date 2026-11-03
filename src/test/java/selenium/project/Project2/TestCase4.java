package selenium.project.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(selenium.project.Project2.Listeners_Program.class)
public class TestCase4 extends Launch_Quit
{
	@Test(retryAnalyzer = selenium.project.Project2.IRetry_Logic.class)
	public void one_way_flight() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.select_wherefrom();
		hp.select_bangalore();
		hp.select_where_to();
		hp.select_mumbai();
		hp.select_date();
		hp.search();
		hp.testcase4(driver);
	/*	HomePage2 hp = new HomePage2(driver);
		hp.select_wherefrom();
		hp.select_bangalore();
		hp.select_where_to();
		hp.select_mumbai();
		//hp.select_date();
		hp.search();
		//hp.testcase4(driver)*/
	}
	

}
