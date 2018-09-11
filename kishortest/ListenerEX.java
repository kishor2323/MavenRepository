package testNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerEX implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {


		System.out.println("My Test Case is pass");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {


		System.out.println("Test Case is Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {


		System.out.println("Test Case is Fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {


		System.out.println("Test Case is Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {


		System.out.println("Class is Started");
		
	}

	@Override
	public void onFinish(ITestContext context) {


		System.out.println("Class is Finish");
		
	}

	
		
}