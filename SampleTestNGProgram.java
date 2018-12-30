package testNGProgram;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SampleTestNGProgram {

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}

	@Test
	public void testMethod() {
		System.out.println("this is a test1 method");
	}

	@AfterTest
	public void afterMethod() {
		System.out.println("this is after method");
	}

}
