public class CsvWriter {
	Character separator;
	Character cellWrapper;

	public CsvWriter(Character separator,Character cellWrapper) {
		this.separator=separator;
		this.cellWrapper=cellWrapper;
	}

	public void write(Csv toWrite) {
	for(Row row : toWrite.rows){
		row.Write();

	}
	}


	}








/*
* Tbh this is probably a message chain, but I don't see a better way to implement this without calling other methods in the class.
* Also primitive obsession, will split each part into own object (CSV->Row-> Cell (abstract) (either quoted/unquoted)
* The only thing i'm not sure of is how to not pass down the cellwrapper+separator to each cell/row/ etc
* Instead split these out into a formatting object, lets see if thats ok
*
* */