package hexlet.code.games;

import java.util.List;
import java.util.Random;

public class Prime implements Game {

    private String expression;
    private String expected;

    public Prime() {
        nextQuestion();
    }

    public String getTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    public String getExpression() {
        return expression;
    }

    public String getExpected() {
        return expected;
    }

    public void nextQuestion() {
        var primeNumbers = List.of(
                2, 3, 5, 7, 11,
                13, 17, 19, 23, 29,
                31, 37, 41, 43, 47,
                53, 59, 61, 67, 71,
                73, 79, 83, 89, 97
        );

        var rand = new Random();
        int number = rand.nextInt(100);

        expression = Integer.toString(number);
        expected = (primeNumbers.contains(number)) ? "yes" : "no";
    }

    public boolean submitAnswer(String answer) {
        return expected.equals(answer);
    }
}
