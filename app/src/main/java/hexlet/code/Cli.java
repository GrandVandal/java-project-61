package hexlet.code;

import hexlet.code.games.Game;

public class Cli {
    public static String username = "";


    public static void print(String text) {
        System.out.print(text);
    }

    public static void println(String text) {
        System.out.println(text);
    }

    public static void showOptions() {
        println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                0 - Exit""");
    }

    public static void greeting() {
        print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        username = App.userInput.nextLine();
        println("Hello, " + username + "!");
        println("");
    }

    public static void checkGreeting() {
        if (username.isEmpty()) {
            greeting();
        }
    }

    public static void showQuestion(Game game) {
        println("Question: " + game.getExpression());
        print("Your answer: ");
    }

    public static void wrongAnswer(String expected, String actual) {
        println("'" + actual + "'"
                + " is wrong answer ;(. Correct answer was "
                + "'" + expected + "'\n");
        println("Let's try again, " + username + "!\n");
    }
}
