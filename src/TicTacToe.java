import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Contains the game, board and all associated functionality
 */
public class TicTacToe implements Game {

    private char[][] board;
    private char currentWinner;
    private int boardSize;

    public TicTacToe() {
        // TODO change board to 1D to make input easier
        this.board = new char[][] {{' ', ' ',' '},{' ', ' ', ' '},{' ', ' ', ' '}};
        boardSize = board[0].length; // assuming square board
    }

    /**
     * prints the current state of the board
     */
    public void printBoard() {
        for (char[] row : board) {
            System.out.print("|");
            for (char i : row) {
                System.out.print(i +"|");
            }
            System.out.print("\n"); // nextline
        }
    }

    /**
     * prints the number associated with each cell for the board
     */
    public void printBoardNums() {

        for (int i = 0; i < boardSize; i++) {
            System.out.print("|");
            for (int j = 0; j < boardSize; j++) {
                System.out.print(boardSize * i + j + "|");

            }
            System.out.print("\n");
        }
    }

    /**
     *
     * @return A list containing all the available moves given the current board state
     */
    public List<Integer> availableMoves() {
        List<Integer> moves = new ArrayList<>();

        for(int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++){
                if (board[i][j] == ' ') moves.add(i * boardSize + j);
            }
        }
        return moves;
    }

    @Override
    public boolean hasEmptySquares() {
        for (char[] r : board) {
            if (Arrays.asList(r).contains(' ')) return true;
        }
        return false;
    }

    @Override
    public int numEmptySquares() {
        return availableMoves().size();
    }

    @Override
    public boolean makeMove(int move, char letter) {
        return false;
    }
}
