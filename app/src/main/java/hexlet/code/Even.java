package hexlet.code;

public class Even {

    public static void beginGame() {
        Cli.checkGreeting();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            if (makeQuestion()) {
                continue;
            }
            return;
        }

        System.out.println("Congratulations, " + Cli.username + "!\n");
    }

    public static boolean makeQuestion() {
        int number = (int) (Math.random() * 100);
        String expectedAnswer = number % 2 == 0 ? "yes" : "no";
        String actualAnswer;

        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        actualAnswer = App.userInput.nextLine();

        if (actualAnswer.equals(expectedAnswer)) {
            System.out.println("Correct!");
            return true;
        }
        System.out.println("'" + actualAnswer + "'"
                + " is wrong answer ;(. Correct answer was "
                + "'" + expectedAnswer + "'\n");
        return false;
    }
}
