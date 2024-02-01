package hexlet.code.games;

import hexlet.code.Engine;

public class Even {

    public static void prepareGame(int maxRounds) {
        String rule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        final int bound = 100;

        String[] expressions = new String[maxRounds];
        String[] expected = new String[maxRounds];

        for (int i = 0; i < maxRounds; i++) {
            int number = Util.nextInt(bound);

            expressions[i] = Integer.toString(number);
            expected[i] = number % 2 == 0 ? "yes" : "no";
        }

        Engine.beginGame(rule, expressions, expected);
    }

}
