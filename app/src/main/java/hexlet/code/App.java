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
        Cli.showMenu();

        System.out.print("Your choice: ");
        String userOption = USER_INPUT.nextLine();
        System.out.println();

        final int maxRounds = 3;
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
