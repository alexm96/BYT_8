
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class CsvWriterTest {

	@Test
	public void testWriter() {
		OriginalCsvWriter csvWriter=new OriginalCsvWriter();
		CsvWriter newCsvWriter = new CsvWriter(',','\"');
		String[][] lines = new String[][] {
				new String[] {},
				new String[] { "only one field" },
				new String[] { "two", "fields" },
				new String[] { "", "contents", "several words included" },
				new String[] { ",", "embedded , commas, included",
						"trailing comma," },
				new String[] { "\"", "embedded \" quotes",
						"multiple \"\"\" quotes\"\"" },
				new String[] { "mixed commas, and \"quotes\"", "simple field" } };
		Csv Sample = new Csv(lines,',','\"');
		// Expected:
		// -- (empty line)
		// only one field
		// two,fields
		// ,contents,several words included
		// ",","embedded , commas, included","trailing comma,"
		// """","embedded "" quotes","multiple """""" quotes"""""
		// "mixed commas, and ""quotes""",simple field
		csvWriter.write(lines);
		newCsvWriter.write(Sample);


	}
}
