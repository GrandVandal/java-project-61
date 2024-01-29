package hexlet.code.games;

import java.util.Random;

public class Gcd implements Game {

    private String expression;
    private String expected;

    public Gcd() {
        nextQuestion();
    }

    public String getTask() {
        return "Find the greatest common divisor of given numbers.";
    }

    public String getExpression() {
        return expression;
    }

    public String getExpected() {
        return expected;
    }

    public void nextQuestion() {
        var rand = new Random();
        int a = rand.nextInt(100);
        int b = rand.nextInt(100);

        expression = a + " " + b;
        expected = gcd(a, b);
    }

    public boolean submitAnswer(String answer) {
        return expected.equals(answer);
    }

    private String gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return Integer.toString(a);
    }
}
