import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Game game = new TicTacToe();
        int square = new Scanner(System.in).nextInt();
        System.out.println(square);
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
        int move;
        while (game.hasEmptySquares()) {
            if (letter == 'O') move = oPlayer.getMove(game);
            else move = xPlayer.getMove(game);


        }



    }
}
