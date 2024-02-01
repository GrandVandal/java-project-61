package hexlet.code;

public class Engine {

    public static void beginGame(String rule, String[] expressions, String[] expected) {
        Cli.greeting();
        System.out.println(rule);

        for (int i = 0; i < expressions.length; i++) {
            showQuestion(expressions[i]);
            String answer = App.getUserInput().nextLine();

            if (!expected[i].equals(answer)) {
                wrongAnswer(expected[i], answer);
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + Cli.getUsername() + "!");
    }

    public static void showQuestion(String expression) {
        System.out.println("Question: " + expression);
        System.out.print("Your answer: ");
    }

    public static void wrongAnswer(String expected, String actual) {
        System.out.println("'" + actual + "'"
                + " is wrong answer ;(. Correct answer was "
                + "'" + expected + "'");
        System.out.println("Let's try again, " + Cli.getUsername() + "!");
    }

}
