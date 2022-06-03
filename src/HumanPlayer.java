import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer implements Player{
    private char letter;
    public HumanPlayer(char letter) {
        this.letter = letter; // to represent in game: X or O

    }


    @Override
    public int getMove(Game game) {
        int val;

        while (true) {
            System.out.println(letter + "'s turn. Inout move (0-8)");
            try {
                val = new Scanner(System.in).nextInt();

                if (!game.availableMoves().contains(val)) { // out of range
                    throw new InputMismatchException();
                }
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid square. Please try again.");

            }
        }
        return val;
    }
}
