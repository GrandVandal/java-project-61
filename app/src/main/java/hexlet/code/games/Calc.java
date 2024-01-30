package hexlet.code.games;

import java.util.Random;

public class Calc {

    public static String expression;
    public static String expected;

    public static void nextQuestion() {
        String[] operators = {"+", "-", "*"};
        var rand = new Random();
        int boundA = 50;
        int boundB = 20;

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
