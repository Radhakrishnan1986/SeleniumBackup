package assertionTest;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAsertTest {

	@Test
	public void logintest() {
		System.out.println("Initiated");
		String actual = "Amazon";
		String expected = "flipkart";
		SoftAssert s = new SoftAssert();
		//SoftAsertTest s = new SoftAsertTest();
		s.assertEquals(actual, expected);
		System.out.println("Completed");
		s.assertAll();

	}

}
