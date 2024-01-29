package hexlet.code.games;

public interface Game {

    String getTask();
    String getExpression();
    String getExpected();
    void nextQuestion();
    boolean submitAnswer(String answer);
}
