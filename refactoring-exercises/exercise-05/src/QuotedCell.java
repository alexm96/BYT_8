public class QuotedCell extends Cell {
    public QuotedCell(String content, Csv.Formatting formatting) {
        super(content, formatting);
    }

    @Override
    public void Write() {
            System.out.print(this.formatting.cellWrapper);
            for (int i = 0; i < content.length(); i++) {
                char c = this.content.charAt(i);
                if (c == this.formatting.cellWrapper){
                    System.out.print(this.formatting.cellWrapper);
                    System.out.print(this.formatting.cellWrapper);}
                else
                    System.out.print(c);
            }

        }
    }

