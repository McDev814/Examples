import java.util.ArrayList;

public class Assertion {
	
	public static void equals(int expected, int actual) {
		evaluate(expected == actual, "Equals Failed!");
	}
	
	public static void equals(String expected, String actual) {
		evaluate(expected.equals(actual), "Equals Failed!");
	}

	public static void arrayEquals(String[] expected, String[] actual) {
		evaluate(expected.equals(actual), "Equals Failed!");
	}
	
	private static void evaluate(boolean condition, String method) {
		if (!condition) {
			throw new AssertionError(method);
		}
	}
}
