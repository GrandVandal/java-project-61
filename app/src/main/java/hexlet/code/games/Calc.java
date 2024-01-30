package hexlet.code.games;

import java.util.Random;

public class Calc {

    private static String expression;
    private static String expected;

    public static String getExpression() {
        return expression;
    }

    public static String getExpected() {
        return expected;
    }

    public static void nextQuestion() {
        String[] operators = {"+", "-", "*"};
        var rand = new Random();
        final int boundA = 50;
        final int boundB = 20;

        String operator = operators[rand.nextInt(operators.length)];
        int a = rand.nextInt(boundA);
        int b = rand.nextInt(boundB);

        expression = a + " " + operator + " " + b;
        if (operator.equals("+")) {
            expected = Integer.toString(a + b);
        }
        if (operator.equals("-")) {
            expected = Integer.toString(a - b);
        }
        if (operator.equals("*")) {
            expected = Integer.toString(a * b);
        }
    }

}
