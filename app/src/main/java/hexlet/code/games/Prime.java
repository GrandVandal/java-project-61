package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {

    public static void prepareGame(int maxRounds) {
        String rule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[] expressions = new String[maxRounds];
        String[] expected = new String[maxRounds];

        for (int i = 0; i < maxRounds; i++) {
            int number = Util.nextInt(100);

            expressions[i] = Integer.toString(number);
            expected[i] = (isPrime(number)) ? "yes" : "no";
        }

        Engine.beginGame(rule, expressions, expected);
    }

    public static boolean isPrime(int number, int index) {
        // Corner cases
        if (number == 0 || number == 1) {
            return false;
        }

        // Checking Prime
        if (number == index) {
            return true;
        }

        // Base cases
        if (number % index == 0) {
            return false;
        }
        index++;
        return isPrime(number, index);
    }

    public static boolean isPrime(int number) {
        return isPrime(number, 2);
    }

}
