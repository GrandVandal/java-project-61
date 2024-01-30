package hexlet.code.games;

import java.util.Random;

public class Gcd {

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
        final int origin = 1;

        int a = rand.nextInt(origin, bound);
        int b = rand.nextInt(origin, bound);

        expression = a + " " + b;
        expected = gcd(a, b);
    }

    public static String gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return Integer.toString(a);
    }
}
