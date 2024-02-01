package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    public static void prepareGame(int maxRounds) {
        String rule = "What is the result of the expression?";
        final int[] boundsArray = new int[] {100, 20};

        String[] expressions = new String[maxRounds];
        String[] expected = new String[maxRounds];

        for (int i = 0; i < maxRounds; i++) {
            int[] numbers = Util.nextIntArray(boundsArray);
            String operator = Util.randomFromArray(new String[]{"+", "-", "*"});

            expressions[i] = numbers[0] + " " + operator + " " + numbers[1];
            expected[i] = formExpected(numbers[0], numbers[1], operator);
        }

        Engine.beginGame(rule, expressions, expected);
    }

    public static String formExpected(int a, int b, String operator) {
        switch (operator) {
            case "+" -> {
                return Integer.toString(a + b);
            }
            case "-" -> {
                return Integer.toString(a - b);
            }
            case "*" -> {
                return Integer.toString(a * b);
            }
            default -> throw new RuntimeException("Invalid operator: '" + operator + "' !");
        }
    }
}
