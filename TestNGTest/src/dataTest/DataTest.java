package dataTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataTest {
	@Parameters({ "username", "password" })

	@Test
	public void loginTest(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}

}
