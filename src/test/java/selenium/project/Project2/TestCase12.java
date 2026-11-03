package selenium.project.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(selenium.project.Project2.Listeners_Program.class)
public class TestCase12 extends Launch_Quit
{
	@Test(retryAnalyzer = selenium.project.Project2.IRetry_Logic.class)
	public void login_searchflight_logout() throws InterruptedException
	{
		RegistrationPage rp = new RegistrationPage(driver);
		rp.signup(driver);
		
		HomePage hp = new HomePage(driver);
		hp.click_fligh_icon(driver);
		
	}

}
