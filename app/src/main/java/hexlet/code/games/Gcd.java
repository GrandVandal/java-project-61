package hexlet.code.games;

import java.util.Random;

public class Gcd {

    public static String expression;
    public static String expected;

    public static void nextQuestion() {
        var rand = new Random();
        int boundA = 50;
        int boundB = 20;

        int a = rand.nextInt(boundA);
        int b = rand.nextInt(boundB);

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
