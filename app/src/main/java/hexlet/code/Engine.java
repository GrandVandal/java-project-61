package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

public class Engine {

    public static void beginGame(String game, int maxRounds) {
        Cli.checkGreeting();

        String expected;
        String expression;
        switch (game) {
            case "Even" -> {
                Cli.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                Even.nextQuestion();
                expected = Even.getExpected();
                expression = Even.getExpression();

            }
            case "Calc" -> {
                Cli.println("What is the result of the expression?");
                Calc.nextQuestion();
                expected = Calc.getExpected();
                expression = Calc.getExpression();
            }
            case "GCD" -> {
                Cli.println("Find the greatest common divisor of given numbers.");
                Gcd.nextQuestion();
                expected = Gcd.getExpected();
                expression = Gcd.getExpression();
            }
            case "Progression" -> {
                Cli.println("What number is missing in the progression?");
                Progression.nextQuestion();
                expected = Progression.getExpected();
                expression = Progression.getExpression();
            }
            case "Prime" -> {
                Cli.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                Prime.nextQuestion();
                expected = Prime.getExpected();
                expression = Prime.getExpression();
            }
            default -> {
                Cli.println("No such game a presented here!");
                return;
            }
        }

        int round = 0;
        while (round < maxRounds) {
            Cli.showQuestion(expression);
            String answer = App.getUserInput().nextLine();

            if (!expected.equals(answer)) {
                Cli.wrongAnswer(expected, answer);
                return;
            }

            Cli.println("Correct!");
            switch (game) {
                case "Even" -> {
                    Even.nextQuestion();
                    expected = Even.getExpected();
                    expression = Even.getExpression();

                }
                case "Calc" -> {
                    Calc.nextQuestion();
                    expected = Calc.getExpected();
                    expression = Calc.getExpression();
                }
                case "GCD" -> {
                    Gcd.nextQuestion();
                    expected = Gcd.getExpected();
                    expression = Gcd.getExpression();
                }
                case "Progression" -> {
                    Progression.nextQuestion();
                    expected = Progression.getExpected();
                    expression = Progression.getExpression();
                }
                case "Prime" -> {
                    Prime.nextQuestion();
                    expected = Prime.getExpected();
                    expression = Prime.getExpression();
                }
                default -> {
                    Cli.println("Somehow game name has changed which should NOT happened!");
                    return;
                }
            }
            round++;
        }

        Cli.println("Congratulations, " + Cli.getUsername() + "!");
    }
}
