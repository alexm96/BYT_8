public class Matcher {
	int[] expected;  int clipLimit; int delta;



	public Matcher(int[] expected, int clipLimit, int delta) {
		this.clipLimit=clipLimit;
		this.expected=expected;
		this.delta=delta;
	}
	public int[] getExpected() {
		return expected;
	}

	public void setExpected(int[] expected) {
		this.expected = expected;
	}

	public int getClipLimit() {
		return clipLimit;
	}

	public void setClipLimit(int clipLimit) {
		this.clipLimit = clipLimit;
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	public boolean match( int[] actual) {

		// Clip "too-large" values
		for (int i = 0; i < actual.length; i++)
			if (actual[i] > clipLimit)
				actual[i] = clipLimit;

		// Check for length differences
		if (actual.length != expected.length)
			return false;

		// Check that each entry within expected +/- delta
		for (int i = 0; i < actual.length; i++)
			if (Math.abs(expected[i] - actual[i]) > delta)
				return false;

		return true;
	}
}
/*
Smell: Long Parameter list? Looks like it would make sense to only pass the actual to match (since we are only checking this) and set/get the expected/delta/clip elsewhere
 */