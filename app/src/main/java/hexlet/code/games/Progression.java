package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression {

    public static String expression;
    public static String expected;

    public static void nextQuestion() {
        String[] progression = new String[10];
        var rand = new Random();

        int accBound = 15;
        int[] stepBounds = {1, 10};

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
