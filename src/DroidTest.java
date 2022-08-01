import java.sql.Array;
import java.util.ArrayList;

public class DroidTest {

	@Test
	// Will test price validation works
	public void positivePrice() {
		
		// Arrange
		String[] types = new String[3];
		for (int i = 0; i < 3; i++) {
			types[i] = "Test " + i;
		}
		int expected = 0;
		Droid d1 = new Droid("C3PO", "Hello there", 500, types);
		
		// Act
		d1.setPrice(-500);
		
		// Assert
		Assertion.equals(expected, (int) d1.getPrice());
		Assertion.arrayEquals(types, d1.getDroidTypes());
	}
}
