package hexlet.code.games;

import java.util.Random;

public class Gcd {

    public static String expression;
    public static String expected;

    public static void nextQuestion() {
        var rand = new Random();
        int bound = 100;
        int origin = 1;

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
