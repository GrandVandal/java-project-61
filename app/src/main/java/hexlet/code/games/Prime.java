package hexlet.code.games;

import java.util.Random;

public class Prime {

    public static String expression;
    public static String expected;

    public static void nextQuestion() {
        var rand = new Random();
        int bound = 100;

        int number = rand.nextInt(bound);

        expression = Integer.toString(number);
        expected = (isPrime(number)) ? "yes" : "no";
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
