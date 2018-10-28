package testResultsTest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestResultsTest {

	@Test
	public void logintest() {
		System.out.println("Test completed");
		//System.out.println(password);
	}
	@AfterMethod
	public void tierdown(ITestResult r) {
		System.out.println(r.getEndMillis());
		System.out.println(r.getHost());
		System.out.println(r.getInstance());
		System.out.println(r.getInstanceName());
		System.out.println(r.getName());
		System.out.println(r.getStartMillis());
		System.out.println(r.getStatus());
		System.out.println(r.getTestName());
		System.out.println(r.getAttributeNames());
		System.out.println(r.getClass());
		System.out.println(r.getMethod());
		System.out.println(r.getParameters());
		System.out.println(r.getTestClass());
		System.out.println(r.getTestContext());
		System.out.println(r.getThrowable());
	}

}
