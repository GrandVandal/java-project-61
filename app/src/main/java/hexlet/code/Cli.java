package hexlet.code;

public class Cli {
    public static String username = "";

    public static void showOptions() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
    }

    public static void greeting() {
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        username = App.userInput.nextLine();
        System.out.println("Hello, " + username + "!");
        System.out.println();
    }

    public static void checkGreeting() {
        if (username.isEmpty()) {
            greeting();
        }
    }
}
