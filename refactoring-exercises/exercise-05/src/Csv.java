public class Csv implements Writeable{
    Row[] rows;

    public Csv(Row[] rows) {
        this.rows = rows;
    }
    public Csv(String[][] someContent,Character separator,Character cellWrapper) {
        Row[] sampleRows= new Row[someContent.length];
        int iter=0;
        for(String[] row:someContent){
            sampleRows[iter]=new Row(row,separator,cellWrapper);
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
