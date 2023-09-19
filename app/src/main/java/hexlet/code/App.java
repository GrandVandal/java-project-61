package hexlet.code;

import java.util.Scanner;
public class App {
    public static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        boolean isExit = false;
        while (!isExit) {

            Cli.showOptions();

            System.out.print("Your choice: ");
            String userOption = userInput.nextLine();
            System.out.println();

            switch (userOption) {
                case "1" -> Cli.greeting();
                case "2" -> Even.beginGame();
                case "0" -> isExit = true;
                default -> System.out.println("Incorrect input!");
            }

        }

    }

}
