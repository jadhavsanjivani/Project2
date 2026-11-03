package selenium.project.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(selenium.project.Project2.Listeners_Program.class)
public class TestCase10 extends Launch_Quit
{
	@Test(retryAnalyzer = selenium.project.Project2.IRetry_Logic.class)
	public void validate_flight_details() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.select_wherefrom();
		hp.select_bangalore();
		hp.select_where_to();
		hp.select_mumbai();
		hp.select_date();
		hp.search();
		Search_ResultPage sr = new Search_ResultPage(driver);
		sr.select_book(driver);
		//sr.add_contact();
		sr.testcase10();
		
		
	}

}
