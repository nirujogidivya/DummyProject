package testCases;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc1Test {
	@Test
	public void m1() {
		Reporter.log("Tc1 got passed",true);
		Reporter.log("Tc1 updated by ATE2",true);
	}

}
