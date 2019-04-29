package testCases;

import org.testng.Assert;

public class TestFailure extends BaseTest {

	public void doLogin() {
		Assert.fail("Failing the login test");
		System.out.println("Capture Screenshot");
	}
}
