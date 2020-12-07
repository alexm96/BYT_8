public class RegularCell extends Cell {
    public RegularCell(String content, Csv.Formatting formatting) {
        super(content, formatting);
    }



    @Override
    public void Write() {
        System.out.print(this.content);
    }
}
