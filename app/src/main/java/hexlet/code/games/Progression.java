package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    public static void prepareGame(int maxRounds) {
        String rule = "What number is missing in the progression?";
        final int accBound = 15;
        final int stepBound = 10;

        String[][] gameRounds = new String[maxRounds][2];

        final int progressionLength = 10;
        for (int i = 0; i < maxRounds; i++) {
            int acc = Util.nextInt(accBound);
            int step = Util.nextInt(1, stepBound);
            int unknown = Util.nextInt(progressionLength);

            String[] progression = makeProgression(progressionLength, acc, step);

            gameRounds[i][1] = progression[unknown];
            progression[unknown] = "..";
            gameRounds[i][0] = String.join(" ", progression);
        }

        Engine.beginGame(rule, gameRounds);
    }

    public static String[] makeProgression(int length, int acc, int step) {
        String[] progression = new String[length];
        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(acc + i * step);
        }
        return progression;
    }

}
