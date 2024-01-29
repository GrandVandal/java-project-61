package hexlet.code.games;

import java.util.Random;

public class Calc implements Game {

    private String expression;
    private String expected;

    public Calc() {
        nextQuestion();
    }

    public String getTask() {
        return "What is the result of the expression?";
    }

    public String getExpression() {
        return expression;
    }

    public String getExpected() {
        return expected;
    }

    public void nextQuestion() {
        String[] operators = {"+", "-", "*"};
        var rand = new Random();

        String operator = operators[rand.nextInt(operators.length)];
        int a = rand.nextInt(50);
        int b = rand.nextInt(20);

        expression = a + " " + operator + " " + b;
        switch (operator) {
            case "+" -> expected = Integer.toString(a + b);
            case "-" -> expected = Integer.toString(a - b);
            case "*" -> expected = Integer.toString(a * b);
        }

    }

    public boolean submitAnswer(String answer) {
        return expected.equals(answer);
    }

}
