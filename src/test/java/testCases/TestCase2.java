package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 extends BaseTest {
	
	@Test
	public void validateTitles() {
		
		SoftAssert softAssert = new SoftAssert();

		String expected_title = "Yahoo.com";
		String actual_title= "Google.com";
		
		softAssert.assertEquals(actual_title,expected_title);
		
		softAssert.assertEquals(true,false);
		
		softAssert.fail("Failing the test as the condition is not met");
		System.out.println("Ending.....");
		
		softAssert.assertAll();
	}

}
