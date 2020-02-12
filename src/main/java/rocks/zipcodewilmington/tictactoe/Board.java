package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {

    private Character[][] board;
    public Board(Character[][] matrix) {
        this.board = matrix;
    }

    public Boolean isInFavorOfX() {
        return ((board[0][0].equals('X') && board[1][0].equals('X') && board[2][0].equals('X')) ||   //Across top
                (board[0][1].equals('X') && board[1][1].equals('X') && board[2][1].equals('X')) ||   //Across middle
                (board[0][2].equals('X') && board[1][2].equals('X') && board[2][2].equals('X')) ||   //Across bottom
                (board[0][0].equals('X') && board[0][1].equals('X') && board[0][2].equals('X')) ||   //Down left
                (board[1][0].equals('X') && board[1][1].equals('X') && board[1][2].equals('X')) ||   //Down middle
                (board[2][0].equals('X') && board[2][1].equals('X') && board[2][2].equals('X')) ||   //Down right
                (board[0][0].equals('X') && board[1][1].equals('X') && board[2][2].equals('X')) ||   //Diagonal bottom right to top left
                (board[0][2].equals('X') && board[1][1].equals('X') && board[2][0].equals('X')));    //Diagonal bottom left to top right
    }

    public Boolean isInFavorOfO() {
        return ((board[0][0].equals('O') && board[1][0].equals('O') && board[2][0].equals('O')) ||   //Across top
                (board[0][1].equals('O') && board[1][1].equals('O') && board[2][1].equals('O')) ||   //Across middle
                (board[0][2].equals('O') && board[1][2].equals('O') && board[2][2].equals('O')) ||   //Across bottom
                (board[0][0].equals('O') && board[0][1].equals('O') && board[0][2].equals('O')) ||   //Down left
                (board[1][0].equals('O') && board[1][1].equals('O') && board[1][2].equals('O')) ||   //Down middle
                (board[2][0].equals('O') && board[2][1].equals('O') && board[2][2].equals('O')) ||   //Down right
                (board[0][0].equals('O') && board[1][1].equals('O') && board[2][2].equals('O')) ||   //Diagonal bottom right to top left
                (board[0][2].equals('O') && board[1][1].equals('O') && board[2][0].equals('O')));    //Diagonal bottom left to top right
    }

    public Boolean isTie() {
        return (this.isInFavorOfO() == this.isInFavorOfX());
    }

    public String getWinner() {
        if (this.isInFavorOfO()){
            return "O";
        }
        else if (this.isInFavorOfX()){
            return "X";
        }
        else {
            return "";
        }
    }

}
