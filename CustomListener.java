package TestNGListenerconcept;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListener extends Base implements ITestListener{
	
		public void onTestFailure(ITestResult result) {
			
			failed(result.getMethod().getMethodName());
		}

}
