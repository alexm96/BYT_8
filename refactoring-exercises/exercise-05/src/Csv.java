public class Csv implements Writeable{
    public class Formatting{
        Character cellWrapper;
        Character separator;

        public Formatting(Character cellWrapper, Character separator) {
            this.cellWrapper = cellWrapper;
            this.separator = separator;
        }
    }
    Row[] rows;
    Formatting formatting;
    public Csv(Row[] rows) {
        this.rows = rows;
    }
    public Csv(String[][] someContent,Character separator,Character cellWrapper) {
        this.formatting=new Formatting(cellWrapper, separator);
        Row[] sampleRows= new Row[someContent.length];
        int iter=0;
        for(String[] row:someContent){
            sampleRows[iter]=new Row(row,formatting);
            iter++;
        }
        this.rows=sampleRows;
    }

    @Override
    public void Write() {
        for(Row row:rows){
            row.Write();
        }
    }
}
