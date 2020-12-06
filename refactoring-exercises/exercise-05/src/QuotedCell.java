public class QuotedCell extends Cell {
    public QuotedCell(String content, Character cellwrapper, Character separator) {
        super(content, cellwrapper, separator);
    }

    @Override
    public void Write() {
            System.out.print(this.Cellwrapper);
            for (int i = 0; i < content.length(); i++) {
                char c = this.content.charAt(i);
                if (c == this.Cellwrapper)
                    System.out.print(this.Cellwrapper+this.Cellwrapper);
                else
                    System.out.print(c);
            }

        }
    }

