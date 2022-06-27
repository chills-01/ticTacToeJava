import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Contains the game, board and all associated functionality
 */
public class TicTacToe implements Game {

    private char[] board;
    private char currentWinner;
    private int boardSize;

    public TicTacToe() {
        // TODO change board to 1D to make input easier
        this.board = new char[] {' ', ' ',' ', ' ', ' ', ' ', ' ', ' ', ' '};
        boardSize = board.length; // num squares in board
    }

    /**
     * prints the current state of the board
     */
    public void printBoard() {
        for (int i = 0; i < boardSize; i++) {
            // newline
            if (i % 3 == 0) { // for 3x3 board
                System.out.print("\n|");
            }
            // print char + |
            System.out.print(Character.toString(board[i]) + '|');
        }
    }

    /**
     * prints the number associated with each cell for the board
     */
    public void printBoardNums() {
        for (int i = 0; i < boardSize; i++) {
            // newline
            if (i % 3 == 0) { // for 3x3 board
                System.out.print("\n|");
            }
            // print char + |
            System.out.print(String.valueOf(i)+ '|');
        }
    }

    /**
     *
     * @return A list containing all the available moves given the current board state
     */
    public List<Integer> availableMoves() {
        List<Integer> moves = new ArrayList<>();

        for(int i = 0; i < boardSize; i++) {
            if (board[i] == ' ') {
                moves.add(i);
            }
        }
        return moves;
    }

    @Override
    public boolean hasEmptySquares() {
        // have to do manually because char is primitive
        for (int i = 0; i < board.length; i++) {
            if (board[i] == ' ') {
                return true;
            }
        }
        return false;
    }

    @Override
    public int numEmptySquares() {
        return availableMoves().size();
    }

    @Override
    /*
    Makes move on board. Returns true if valid, false otherwise
     */
    public boolean makeMove(char square, char letter) {
        if (board[square] == ' ') {
            board[square] = letter;
            return true;
        }
        return false;
    }
}
