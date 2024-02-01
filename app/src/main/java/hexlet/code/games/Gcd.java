package hexlet.code.games;

import hexlet.code.Engine;

public class Gcd {

    public static void prepareGame(int maxRounds) {
        String rule = "Find the greatest common divisor of given numbers.";

        String[] expressions = new String[maxRounds];
        String[] expected = new String[maxRounds];

        for (int i = 0; i < maxRounds; i++) {
            int[] numbers = Util.nextIntArray(2, 100);

            expressions[i] = numbers[0] + " " + numbers[1];
            expected[i] = gcd(numbers[0], numbers[1]);
        }

        Engine.beginGame(rule, expressions, expected);
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
