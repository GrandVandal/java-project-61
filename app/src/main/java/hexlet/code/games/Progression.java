package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression {

    private static String expression;
    private static String expected;

    public static String getExpression() {
        return expression;
    }

    public static String getExpected() {
        return expected;
    }

    public static void nextQuestion() {
        String[] progression = new String[10];
        var rand = new Random();

        final int accBound = 15;
        final int[] stepBounds = {1, 10};

        int acc = rand.nextInt(accBound);
        int step = rand.nextInt(stepBounds[0], stepBounds[1]);
        int unknown = rand.nextInt(progression.length);

        for (int i = 0; i < progression.length; i++) {
            if (i == unknown) {
                expected = Integer.toString(acc);
            }
            progression[i] = (i != unknown) ? Integer.toString(acc) : "..";
            acc += step;
        }

        expression = Arrays.toString(progression)
                .replaceAll(",", "")
                .replaceAll("[\\[\\]]", "");
    }

}
