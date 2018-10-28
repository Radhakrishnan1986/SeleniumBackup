package rerunFailedTest;

import org.testng.annotations.Test;

public class RerunFailedTest {

	@Test
	public void logintest() {
		System.out.println("Login Completed");
	}
	
	@Test
	public void bookingtest() {
		System.out.println("Booking completed");
		int i = 1/0;
	}
}
