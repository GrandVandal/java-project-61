package hexlet.code.games;

import java.util.Random;

public class Even {

    public static String expression;
    public static String expected;

    public static void nextQuestion() {
        var rand = new Random();
        int bound = 100;

        int number = rand.nextInt(bound);

        expression = Integer.toString(number);
        expected = number % 2 == 0 ? "yes" : "no";
    }
}
