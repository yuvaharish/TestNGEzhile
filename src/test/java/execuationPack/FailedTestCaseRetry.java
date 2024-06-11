package execuationPack;

import static org.junit.Assert.assertArrayEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCaseRetry {

	//@Test(retryAnalyzer = RetryExample.class)
	@Test
	public void testOne() {
		Assert.assertEquals(true, false);
		System.out.println("Test One");
	}

	//@Test(retryAnalyzer = RetryExample.class)
	@Test(invocationCount = 100)
	public void testTwo() {
		Assert.assertEquals(true, true);
		System.out.println("Test Two");
	}

}
