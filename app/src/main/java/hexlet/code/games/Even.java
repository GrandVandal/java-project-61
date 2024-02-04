package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {

    public static void prepareGame(int maxRounds) {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int bound = 100;

        String[][] gameRounds = new String[maxRounds][2];

        for (int i = 0; i < maxRounds; i++) {
            int number = Util.nextInt(bound);

            gameRounds[i][0] = Integer.toString(number);
            gameRounds[i][1] = isEven(number) ? "yes" : "no";
        }

        Engine.beginGame(rule, gameRounds);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
