import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String candidateName = scanner.nextLine();
        Candidate candidate = new Candidate(candidateName);

        Question[] questions = {
                new Question("1 byte equals to?", "8 bits"),
                new Question("What is OOP?", "Object-Oriented Programming"),
                new Question("Capital of Kazakhstan?", "Astana"),
                new Question("5*5 equals to?", "25")
        };

        int score = 0;

        System.out.println("\nWelcome, " + candidate.getName() + "! Let's start the quiz.");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQuestion " + (i + 1) + ": " + questions[i].getText());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine().trim();

            if (questions[i].isCorrect(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + questions[i].getAnswer());
            }
        }

        System.out.println("\nQuiz finished! You scored " + score + " out of " + questions.length);

        scanner.close();
    }
}
