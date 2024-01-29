package hexlet.code;

import java.util.Scanner;
public class App {
    public static Scanner userInput = new Scanner(System.in);
    public static Engine gameEngine = new Engine();

    public static void main(String[] args) {
        Cli.showOptions();

        System.out.print("Your choice: ");
        String userOption = userInput.nextLine();
        System.out.println();

        switch (userOption) {
            case "1" -> Cli.greeting();
            case "2" -> gameEngine.beginGame("Even");
            case "3" -> gameEngine.beginGame("Calc");
            case "4" -> gameEngine.beginGame("GCD");
            case "5" -> gameEngine.beginGame("Progression");
            case "6" -> gameEngine.beginGame("Prime");
            case "0" -> {
                return;
            }
            default -> System.out.println("Incorrect input!");
        }

    }

}
