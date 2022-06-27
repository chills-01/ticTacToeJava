import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Game game = new TicTacToe();
    }

    /**
     *
     * @param game
     * @param xPlayer
     * @param oPlayer
     * @param printGame
     */
    public static void play(Game game, Player xPlayer, Player oPlayer, boolean printGame) {
        if (printGame) game.printBoardNums();

        // X goes first
        char letter = 'X';
        int square;
        while (game.hasEmptySquares()) {
            if (letter == 'O') square = oPlayer.getMove(game);
            else square = xPlayer.getMove(game);

            if (game.makeMove(square, letter)) {
                if (printGame) {
                    System.out.println(letter + " makes a move to square " + String.valueOf(square));
                    game.printBoard();
                    System.out.println(); // empty line
                }

                // change player move
                if (letter == 'O') {
                    letter = 'X';
                }
                else {
                    letter = 'O';
                }
            }


        }



    }
}
