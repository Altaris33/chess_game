package piece;

public abstract class Piece {

    private final ColorEnum color;
     private String symbol;

    public Piece(ColorEnum color) {
        this.color = color;
    }

    public Piece(ColorEnum color, String symbol) {
        this.color = color;
        this.symbol = symbol;
    }

    public ColorEnum getColor() {
        return color;
    }

    public String getSymbol() {
        return symbol;
    }
}
