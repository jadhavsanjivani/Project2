package selenium.project.Project2;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(selenium.project.Project2.Listeners_Program.class)
public class TestCase1 extends Launch_Quit
{
	@Test(retryAnalyzer = selenium.project.Project2.IRetry_Logic.class)
	public void registration()
	{
		RegistrationPage rp = new RegistrationPage(driver);
		rp.signup(driver);
	}
	

}
