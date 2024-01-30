package hexlet.code.games;

import java.util.Random;

public class Even {

    private static String expression;
    private static String expected;

    public static String getExpression() {
        return expression;
    }

    public static String getExpected() {
        return expected;
    }

    public static void nextQuestion() {
        var rand = new Random();
        final int bound = 100;

        int number = rand.nextInt(bound);

        expression = Integer.toString(number);
        expected = number % 2 == 0 ? "yes" : "no";
    }
}
