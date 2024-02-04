package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;
public class App {
    private static final Scanner USER_INPUT = new Scanner(System.in);

    public static Scanner getUserInput() {
        return USER_INPUT;
    }

    public static void main(String[] args) {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        String userOption = USER_INPUT.nextLine();
        System.out.println();

        final int maxRounds = Engine.getMaxRounds();
        switch (userOption) {
            case "1" -> Cli.greeting();
            case "2" -> Even.prepareGame(maxRounds);
            case "3" -> Calc.prepareGame(maxRounds);
            case "4" -> Gcd.prepareGame(maxRounds);
            case "5" -> Progression.prepareGame(maxRounds);
            case "6" -> Prime.prepareGame(maxRounds);
            case "0" -> System.out.println("See you soon!");
            default -> System.out.println("Incorrect input!");
        }

    }

}
