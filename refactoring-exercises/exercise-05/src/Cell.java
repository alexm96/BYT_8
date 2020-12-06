public abstract class Cell implements Writeable {
   String content;
    Character Cellwrapper;
    Character separator;
    public Cell(String content,Character cellwrapper,Character separator) {
       this.content=content;
       this.Cellwrapper=cellwrapper;
       this.separator=separator;
    }

}
