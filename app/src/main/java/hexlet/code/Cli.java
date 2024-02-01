package hexlet.code;

public class Cli {
    private static String username = "";

    public static  String getUsername() {
        return username;
    }

    public static void showMenu() {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
    }

    public static void greeting() {
        System.out.print("""
                Welcome to the Brain Games!
                May I have your name?\s""");
        username = App.getUserInput().nextLine();
        System.out.println("Hello, " + username + "!");
    }

}
