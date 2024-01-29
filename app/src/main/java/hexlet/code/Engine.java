package hexlet.code;

import hexlet.code.games.Game;
import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Gcd;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Map;
import java.util.HashMap;

public class Engine {

    private final Map<String, Game> gameList = new HashMap<>(Map.of(
            "Even", new Even(),
            "Calc", new Calc(),
            "GCD", new Gcd(),
            "Progression", new Progression(),
            "Prime", new Prime()
    ));

    public void beginGame(String game, int maxRounds) {
        Cli.checkGreeting();

        Game currentGame = gameList.get(game);
        Cli.println(currentGame.getTask());

        int round = 0;
        while (round < maxRounds) {
            Cli.showQuestion(currentGame);
            String answer = App.userInput.nextLine();

            if (!currentGame.submitAnswer(answer)) {
                Cli.wrongAnswer(currentGame.getExpected(), answer);
                currentGame.nextQuestion();
                return;
            }

            Cli.println("Correct!");
            currentGame.nextQuestion();
            round++;
        }

        Cli.println("Congratulations, " + Cli.username + "!\n");
    }

    public void beginGame(String game) {
        beginGame(game, 3);
    }

}
