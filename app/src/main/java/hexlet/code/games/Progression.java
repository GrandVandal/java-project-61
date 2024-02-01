package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {

    public static void prepareGame(int maxRounds) {
        String rule = "What number is missing in the progression?";
        final int accBound = 15;
        final int stepBound = 10;

        String[] expressions = new String[maxRounds];
        String[] expected = new String[maxRounds];

        final int progressionLength = 10;
        for (int i = 0; i < maxRounds; i++) {
            int acc = Util.nextInt(accBound);
            int step = Util.nextInt(1, stepBound);
            int unknown = Util.nextInt(progressionLength);

            String[] progression = makeProgression(progressionLength, acc, step);

            expected[i] = progression[unknown];
            progression[unknown] = "..";
            expressions[i] = Arrays.toString(progression)
                    .replaceAll(",", "")
                    .replaceAll("[\\[\\]]", "");
        }

        Engine.beginGame(rule, expressions, expected);
    }

    public static String[] makeProgression(int length, int acc, int step) {
        String[] progression = new String[length];
        for (int elem = 0; elem < length; elem++) {
            progression[elem] = Integer.toString(acc);
            acc += step;
        }
        return progression;
    }

}
