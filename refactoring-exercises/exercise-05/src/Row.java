public class Row implements IWriteable {
    Character separator;
    Character cellWrapper;
    Cell[] row;
    Csv.Formatting formatting;
    public Row(Cell[] row) {
        this.row = row;
    }



    public Row(String[] row, Csv.Formatting formatting) {
        // Generates own cells
        this.formatting=formatting;
        Cell[] sampleCells=new Cell[row.length];
        int iter=0;
        for (String content : row){
            if(shouldwriteQuoted(content)){
                sampleCells[iter]=new QuotedCell(content,formatting);
            }
            else{
                sampleCells[iter]=new RegularCell(content,formatting);
            }
            iter++;
        }
        this.row=sampleCells;
    }

    private boolean shouldwriteQuoted(String field) {
        return field.indexOf(this.formatting.separator) != -1 || field.indexOf(this.formatting.cellWrapper) != -1;
    }
    @Override
    public void Write() {
        if(row.length==0){
            System.out.println();
            return;
        }
        row[0].Write();
        for (int i =1;i<row.length;i++){
            System.out.print(this.formatting.separator);
            row[i].Write();
        }
        System.out.println();
    }
}
