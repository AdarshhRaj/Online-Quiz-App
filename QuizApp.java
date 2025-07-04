import java.util.ArrayList;
import java.util.Scanner;

class Question {
    String question, optionA, optionB, optionC, optionD, correctOption;

    public Question(String question, String optionA, String optionB, String optionC, String optionD, String correctOption) {
        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.correctOption = correctOption.toUpperCase();
    }

    public boolean isCorrect(String answer) {
        return correctOption.equals(answer.toUpperCase());
    }

    public void display() {
        System.out.println(question);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }
}

public class QuizApp {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        questions.add(new Question("What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "C"));
        questions.add(new Question("Which language is used for Android development?", "Python", "Java", "Swift", "C++", "B"));
        questions.add(new Question("What is 2 + 2?", "3", "4", "5", "6", "B"));
        questions.add(new Question("Which planet is known as the Red Planet?", "Earth", "Venus", "Mars", "Jupiter", "C"));
        questions.add(new Question("Who wrote 'Romeo and Juliet'?", "Shakespeare", "Hemingway", "Orwell", "Tolkien", "A"));

        int score = 0;
        System.out.println("Welcome to the Quiz!\n");

        for (int i = 0; i < questions.size(); i++) {
            System.out.println("Question " + (i + 1) + ":");
            questions.get(i).display();
            System.out.print("Your answer (A/B/C/D): ");
            String answer = scanner.nextLine();

            if (questions.get(i).isCorrect(answer)) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was: " + questions.get(i).correctOption + "\n");
            }
        }

        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + questions.size());

        scanner.close();
    }
}
