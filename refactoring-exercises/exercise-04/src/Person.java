import java.io.IOException;
import java.io.Writer;

public class Person {
	public String last;
	public String first;
	public String middle;
	public Person(String last, String first, String middle) {
		this.last = last;
		this.first = first;
		this.middle = middle;
	}
	public void printSelf(Writer out) throws IOException {
		out.write(first);
		out.write(" ");
		if (middle != null) {
			out.write(middle);
			out.write(" ");
		}
		out.write(last);
	}
	public  String formatSelf() {
		String result = last + ", " + first;
		if (middle != null)
			result += " " + middle;
		return result;
	}
	public  void display(Writer out) throws IOException {
		out.write(this.last);
		out.write(", ");
		out.write(this.first);
		if (this.middle != null) {
			out.write(" ");
			out.write(this.middle);
		}}
	@Override
	public String toString() {
		return last + ", " + first
				+ ((middle == null) ? "" : " " + middle);
	}
}
/*
Lazy class, can all be combined into one person class OR if necessary split into Client which inherits from person (not sure which you prefer)
 */