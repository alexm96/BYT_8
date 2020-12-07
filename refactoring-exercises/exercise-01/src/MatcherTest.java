
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class MatcherTest {

	@Test
	public void testMatch() {
		int[] expected = new int[] { 10, 50, 30, 98 };
		int clipLimit = 100;
		int delta = 5;

		int[] actual = new int[] { 12, 55, 25, 110 };
		Matcher matcher = new Matcher(expected,clipLimit,delta);



		assertTrue(matcher.match(actual));

		actual = new int[] { 10, 60, 30, 98 };
		assertFalse(matcher.match(actual));

		actual = new int[] { 10, 50, 30 };
		assertFalse(matcher.match(actual));
	}
}
