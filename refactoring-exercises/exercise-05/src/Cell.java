public abstract class Cell implements Writeable {
   String content;
    Csv.Formatting formatting;
    public Cell(String content, Csv.Formatting formatting) {
       this.formatting=formatting;
       this.content=content;
    }

}
