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
                expected = Even.expected;
                expression = Even.expression;

            }
            case "Calc" -> {
                Cli.println("What is the result of the expression?");
                Calc.nextQuestion();
                expected = Calc.expected;
                expression = Calc.expression;
            }
            case "GCD" -> {
                Cli.println("Find the greatest common divisor of given numbers.");
                Gcd.nextQuestion();
                expected = Gcd.expected;
                expression = Gcd.expression;
            }
            case "Progression" -> {
                Cli.println("What number is missing in the progression?");
                Progression.nextQuestion();
                expected = Progression.expected;
                expression = Progression.expression;
            }
            case "Prime" -> {
                Cli.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                Prime.nextQuestion();
                expected = Prime.expected;
                expression = Prime.expression;
            }
            default -> {
                Cli.println("No such game a presented here!");
                return;
            }
        }

        int round = 0;
        while (round < maxRounds) {
            Cli.showQuestion(expression);
            String answer = App.userInput.nextLine();

            if (!expected.equals(answer)) {
                Cli.wrongAnswer(expected, answer);
                return;
            }

            Cli.println("Correct!");
            switch (game) {
                case "Even" -> {
                    Even.nextQuestion();
                    expected = Even.expected;
                    expression = Even.expression;

                }
                case "Calc" -> {
                    Calc.nextQuestion();
                    expected = Calc.expected;
                    expression = Calc.expression;
                }
                case "GCD" -> {
                    Gcd.nextQuestion();
                    expected = Gcd.expected;
                    expression = Gcd.expression;
                }
                case "Progression" -> {
                    Progression.nextQuestion();
                    expected = Progression.expected;
                    expression = Progression.expression;
                }
                case "Prime" -> {
                    Prime.nextQuestion();
                    expected = Prime.expected;
                    expression = Prime.expression;
                }
                default -> {
                    Cli.println("Somehow game name has changed which should NOT happened!");
                    return;
                }
            }
            round++;
        }

        Cli.println("Congratulations, " + Cli.username + "!");
    }
}
