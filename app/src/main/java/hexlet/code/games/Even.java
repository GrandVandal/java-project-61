package hexlet.code.games;

import java.util.Random;

public class Even implements Game {

    private int expression;
    private String expected;

    public Even() {
        nextQuestion();
    }

    public String getTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    public String getExpression() {
        return Integer.toString(expression);
    }

    public String getExpected() {
        return expected;
    }

    public void nextQuestion() {
        var rand = new Random();
        expression = rand.nextInt(100);
        expected = expression % 2 == 0 ? "yes" : "no";
    }

    public boolean submitAnswer(String answer) {
        return expected.equals(answer);
    }
}
