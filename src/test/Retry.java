package test;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer
{
	int count=0;
	int maxcount=1;

	public boolean retry(ITestResult result)
	{
		if(count<maxcount)
		{
			System.out.println("retrying"+count);
			System.out.println("status= "+result.getStatus());
			count++;
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
