import java.util.List;

public interface Game {
    void printBoard();
    void printBoardNums();
    List<Integer> availableMoves();
    boolean hasEmptySquares();
    int numEmptySquares();
    boolean makeMove(int move, char letter);


}
