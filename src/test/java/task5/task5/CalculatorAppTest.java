package task5.task5;

import org.testng.annotations.*;

import junit.framework.Assert;

public class CalculatorAppTest {
	@Test
	@Parameters({"a","b"})
	public void testAdd(String sa, String sb) {
		CalculatorApp app = new CalculatorApp();
		int a = Integer.parseInt(sa);
		int b = Integer.parseInt(sb);
		int actual=app.addMethod(a, b);
		int expected=a+b;
		Assert.assertEquals(actual, expected);
	}
	@Test
	@Parameters({"a","b"})
	public void testSub(String sa, String sb) {
		CalculatorApp app = new CalculatorApp();
		int a = Integer.parseInt(sa);
		int b = Integer.parseInt(sb);
		int actual=app.subMethod(a,b);
		int expected=a-b;
		Assert.assertEquals(actual, expected);
	}
	@Test
	@Parameters({"a","b"})
	public void testMul(String sa, String sb) {
		CalculatorApp app = new CalculatorApp();
		int a = Integer.parseInt(sa);
		int b = Integer.parseInt(sb);
		int actual=app.mulMethod(a, b);
		int expected=a*b;
		Assert.assertEquals(actual, expected);
	}
}
