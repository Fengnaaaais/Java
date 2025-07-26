import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random random = new Random();

    String[] choices = {"rock", "paper", "scissors"};
    String playerChoice;
    String computerChoise;
    String playAgain = "y";

    do {
      System.out.print("Enter your move (rock, paper, scissors): ");
      playerChoice = in.nextLine().toLowerCase();

      if (!playerChoice.equals("rock")
          && !playerChoice.equals("paper")
          && !playerChoice.equals("scissors")) {
        System.out.println("Invalid choice");
        continue;
      }

      computerChoise = choices[random.nextInt(3)];
      System.out.printf("Computer choice %s\n", computerChoise);
      if (playerChoice.equals(computerChoise)) {
        System.out.println("It's a tie");
      } else if (playerChoice.equals("rock") && computerChoise.equals("scissors")
          || playerChoice.equals("paper") && computerChoise.equals("rock")
          || playerChoice.equals("scissors") && computerChoise.equals("paper")) {
        System.out.println("You win!");
      } else {
        System.out.println("You lose!");
      }

      System.out.print("Play again?(y/n): ");
      playAgain = in.nextLine().toLowerCase();

    } while (playAgain.equals("y"));
    
    System.out.println("Thanks for playing!");

    in.close();
  }
}
