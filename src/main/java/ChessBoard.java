import piece.ColorEnum;
import piece.IPiece;
import piece.Pawn;
import piece.Piece;

public class ChessBoard {


    private Piece[][] grid;


    public ChessBoard() {
        this.grid = new Piece[Constantes.TAILLE_PLATEAU][Constantes.TAILLE_PLATEAU];

        fill();

    }

    private void fill() {

        // On remplit la ligne du haut (Blancs)
        for (int j = 0; j < Constantes.TAILLE_PLATEAU; j++) {
            this.grid[1][j] = new Pawn(ColorEnum.WHITE);
        }


        // On remplit la ligne du bas (Noir)
        for (int j = 0; j < Constantes.TAILLE_PLATEAU; j++) {
            this.grid[6][j] = new Pawn(ColorEnum.BLACK);
        }


    }


    /* -------------------------------------
    Getters/setters
     ---------------------------------------*/

    public Piece[][] getGrid() {
        return grid;
    }



}
