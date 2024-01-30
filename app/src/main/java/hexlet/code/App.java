package hexlet.code;

import java.util.Scanner;
public class App {
    private static Scanner userInput = new Scanner(System.in);

    public static Scanner getUserInput() {
        return userInput;
    }

    public static void main(String[] args) {
        Cli.showOptions();

        Cli.print("Your choice: ");
        String userOption = userInput.nextLine();
        Cli.println("");

        final int maxRounds = 3;
        switch (userOption) {
            case "1" -> Cli.greeting();
            case "2" -> Engine.beginGame("Even", maxRounds);
            case "3" -> Engine.beginGame("Calc", maxRounds);
            case "4" -> Engine.beginGame("GCD", maxRounds);
            case "5" -> Engine.beginGame("Progression", maxRounds);
            case "6" -> Engine.beginGame("Prime", maxRounds);
            case "0" -> Cli.println("See you soon!");
            default -> Cli.println("Incorrect input!");
        }

    }

}
