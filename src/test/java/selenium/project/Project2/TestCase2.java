package selenium.project.Project2;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(selenium.project.Project2.Listeners_Program.class)
public class TestCase2 extends Launch_Quit
{
	@Test(retryAnalyzer = selenium.project.Project2.IRetry_Logic.class)
	public void login_valid() throws EncryptedDocumentException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.valid_login(driver);
	}

}
