// The Person class has multiple clients, but all of the clients are in 
// one file for convenience.  Imagine them as non-test methods in separate 
// client classes.


import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonClientsTest {

	@Test
	public void testClients() throws IOException {
		Person bobSmith = new Person("Smith", "Bob", null);
		Person jennyJJones = new Person("Jones", "Jenny", "J");

		StringWriter out = new StringWriter();
		bobSmith.printSelf(out);
		assertEquals("Bob Smith", out.toString());

		out = new StringWriter();
		jennyJJones.printSelf(out);
		assertEquals("Jenny J Jones", out.toString());

		assertEquals("Smith, Bob", bobSmith.formatSelf());
		assertEquals("Jones, Jenny J",jennyJJones.formatSelf());

		out = new StringWriter();
		bobSmith.display(out);
		assertEquals("Smith, Bob", out.toString());

		out = new StringWriter();
		jennyJJones.display(out);
		assertEquals("Jones, Jenny J", out.toString());

		assertEquals("Smith, Bob", bobSmith.toString());
		assertEquals("Jones, Jenny J", jennyJJones.toString());
	}
}
