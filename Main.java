import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String[] questions = {
      "What is the main function of a router?",
      "Which part of computer is considered the brain?",
      "Which company created windows?",
      "What year was Facebook launched?",
      "What was the first programming language?"
    };
    String[][] options = {
      {
        "1. Storing files", 
        "2. Encripting data", 
        "3. Directing internet trafic", 
        "4. Managing passwords"
      },
      {
        "1. CPU", 
        "2. Hard drive", 
        "3. RAM", 
        "4. GPU"
      },
      {
        "1. Microsoft", 
        "2. Meta", 
        "3. Google", 
        "4. Netflix"
      },
      {
        "1. 2000", 
        "2. 2004", 
        "3. 2006", 
        "4. 2008"
      },
      {
        "1. COBOL", 
        "2. C", 
        "3. Fortrun", 
        "4. Assembly"
      }
    };

    int[] answers = {3, 1, 1, 2, 3};
    int score = 0;
    int guess;

    Scanner in = new Scanner(System.in);

    System.out.println("Welcome to the Java Quiz Game!");

    for (int i = 0; i < questions.length; i++) {
      System.out.println(questions[i]);

      for (String option : options[i]) {
        System.out.println(option);
      }

      System.out.print("Enter your guess: ");
      guess = in.nextInt();

      if (guess == answers[i]) {
        System.out.println("CORECT!");
        score++;
      }
      else {
        System.out.println("WRONG!");
      }
    }

    System.out.printf("Your final score: %d out of %d\n", score, questions.length);

    in.close();
  }
}
