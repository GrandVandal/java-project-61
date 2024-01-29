package hexlet.code.games;

import java.util.Arrays;
import java.util.Random;

public class Progression implements Game {

    private String expression;
    private String expected;

    public Progression() {
        nextQuestion();
    }

    public String getTask() {
        return "What number is missing in the progression?";
    }

    public String getExpression() {
        return expression;
    }

    public String getExpected() {
        return expected;
    }

    public void nextQuestion() {
        String[] progression = new String[10];
        var rand = new Random();

        int acc = rand.nextInt(15);
        int step = rand.nextInt(1, 10);
        int unknown = rand.nextInt(10);

        for (int i = 0; i < progression.length; i++) {
            if (i == unknown) {
                expected = Integer.toString(acc);
            }
            progression[i] = (i != unknown) ? Integer.toString(acc) : "..";
            acc += step;
        }

        expression = Arrays.toString(progression)
                .replaceAll(",", "")
                .replaceAll("[\\[\\]]", "");
    }

    public boolean submitAnswer(String answer) {
        return expected.equals(answer);
    }

}
