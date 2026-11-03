package selenium.project.Project2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetry_Logic implements IRetryAnalyzer
{
	int count;
	int retry = 2;
	

	@Override
	public boolean retry(ITestResult result) 
	{
		if(count<retry)
		{
			count++;
			System.out.println(count);

			return true;
		}
		
		return false;
	}

	

}
