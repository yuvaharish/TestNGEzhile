package execuationPack;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersExample implements ITestListener {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Code will launch");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Screen shots");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Screen shots for failed");
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("On Finish");
	}
	
}
