package selenium.project.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(selenium.project.Project2.Listeners_Program.class)
public class TestCase15 extends Launch_Quit
{
	@Test(retryAnalyzer = selenium.project.Project2.IRetry_Logic.class)
	public void make_payment() throws InterruptedException
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
		sr.click_continue1(driver);
		sr.click_continue(driver);
		//sr.add_contact();
		Add_Contact_detailPage ac = new Add_Contact_detailPage(driver);
		ac.enter_mobile();
		Add_Traveller_datailPage at = new Add_Traveller_datailPage(driver);
		at.enter_fname();
		PaymentPage pp = new PaymentPage(driver);
		pp.select_card(driver);
		
	}

}
