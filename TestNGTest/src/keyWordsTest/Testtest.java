package keyWordsTest;

import org.testng.annotations.Test;

public class Testtest {

	@Test(priority = 1)
	public void add() {
		System.out.println("add");
	}

	@Test(priority = 2)
	public void sub() {
		System.out.println("sub");

	}

	@Test(priority = 4)
	public void mul() {
		System.out.println("mul");

	}

	@Test(priority = 3)
	public void divide() {
		System.out.println("divide");

	}
}