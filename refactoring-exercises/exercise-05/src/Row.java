public class Row implements Writeable {
    Character separator;
    Character cellWrapper;
    Cell[] row;
    public Row(Cell[] row) {
        this.row = row;
    }

    public Row(String[] row,Character separator,Character cellWrapper) {
        // Generates own cells
        this.separator=separator;
        this.cellWrapper=cellWrapper;
       Cell[] sampleCells=new Cell[row.length];
       int iter=0;
       for (String content : row){
          if(shouldwriteQuoted(content)){
              sampleCells[iter]=new QuotedCell(content,cellWrapper,separator);
          }
          else{
              sampleCells[iter]=new RegularCell(content,cellWrapper,separator);
          }
          iter++;
       }
       this.row=sampleCells;
    }
    private boolean shouldwriteQuoted(String field) {
        return field.indexOf(this.separator) != -1 || field.indexOf(this.cellWrapper) != -1;
    }
    @Override
    public void Write() {
        if(row.length==0){
            System.out.println();
            return;
        }
        row[0].Write();
        for (int i =1;i<row.length;i++){
            System.out.print(separator);
            row[i].Write();
        }
        System.out.println();
    }
}
