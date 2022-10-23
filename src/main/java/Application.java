import piece.ColorEnum;
import piece.Piece;

public class Application {

    /*
    For character symbols see : {@link #https://www.w3.org/TR/xml-entity-names/023.html}
     */

    public static void main(String[] args) {
        ChessBoard board = new ChessBoard();
        displayWithBorders(board);
    }

    private static void display(ChessBoard board) {

        Piece[][] grid = board.getGrid();

        for (int i = 0; i < Constantes.TAILLE_PLATEAU; i++) {
            for (int j = 0; j < Constantes.TAILLE_PLATEAU; j++) {
                System.out.print(" _ ");
            }
            System.out.println();
        }
    }

    public static void displayWithBorders(ChessBoard board) {
        Piece[][] grid = board.getGrid();

        displayLetters();

        System.out.println();
        System.out.print("  ");
        displayHorizontalLane();

        System.out.println();

        for (int i = 0; i < Constantes.TAILLE_PLATEAU; i++) {

            System.out.print((i + 1) + "|");

            for (int j = 0; j < Constantes.TAILLE_PLATEAU; j++) {

                if (grid[i][j] == null) {
                    System.out.print(" _ ");
                } else {
                    Piece piece = grid[i][j];
                    System.out.print(" " + getSymbol(piece) + " ");
                }
            }
            System.out.print("|" + (i + 1));
            System.out.println();
        }
        System.out.print("  ");
        displayHorizontalLane();
        System.out.println();

        displayLetters();
    }

    private static void displayLetters() {
        System.out.print("  ");

        for (int i = 0; i < Constantes.LETTRES_PLATEAU.length; i++) {
            System.out.print(" ");
            System.out.print(Constantes.LETTRES_PLATEAU[i]);
            System.out.print(" ");
        }
    }

    private static void displayHorizontalLane() {
        for (int i = 0; i < Constantes.TAILLE_PLATEAU; i++) {
            System.out.print("---");
        }
    }

    private static String getSymbol(Piece piece) {
        if (piece.getColor() == ColorEnum.BLACK) {
            return piece.getSymbol().toLowerCase();
        }
        return piece.getSymbol();
    }
}
