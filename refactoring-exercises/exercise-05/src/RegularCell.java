public class RegularCell extends Cell {
    public RegularCell(String content, Character cellwrapper, Character separator) {
        super(content, cellwrapper, separator);
    }

    @Override
    public void Write() {
        System.out.println(this.content);
    }
}
