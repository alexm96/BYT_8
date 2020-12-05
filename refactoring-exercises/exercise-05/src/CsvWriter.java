public class CsvWriter {
	Character separator;
	Character cellWrapper;

	public CsvWriter(Character separator,Character cellWrapper) {
		this.separator=separator;
		this.cellWrapper=cellWrapper;
	}

	public void write(String[][] lines) {
		for (String[] line : lines) writeLine(line);
	}

	private void writeLine(String[] fields) {
		if (fields.length == 0)
			System.out.println();
		else {


			for (String field : fields) {
				System.out.print(separator);
				writeField(field);
			}
			System.out.println();
		}
	}

	private void writeField(String field) {
		if (field.indexOf(this.separator) != -1 || field.indexOf(this.cellWrapper) != -1)
			writeQuoted(field);
		else
			System.out.print(field);
	}

	private void writeQuoted(String field) {
		System.out.print(this.cellWrapper);
		for (int i = 0; i < field.length(); i++) {
			char c = field.charAt(i);
			if (c == this.cellWrapper)
				System.out.print(this.cellWrapper+this.cellWrapper);
			else
				System.out.print(c);
		}
		System.out.print(this.cellWrapper);
	}

}
/*
* Tbh this is probably a message chain, but I don't see a better way to implement this without calling other methods in the class.
* */