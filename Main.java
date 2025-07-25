import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner in = new Scanner(System.in);

    int guess;
    int attempts = 0;
    int min = 1;
    int max = 100;
    int randomNumber = random.nextInt(min, max + 1);

    System.out.println("Number Guesting Game!");
    System.out.printf("Guess a number between %d-%d\n", min, max);

    do {
      System.out.print("Enter the guess: ");
      guess = in.nextInt();
      attempts++;
      
      if (guess < randomNumber) 
      {
        System.out.println("TOO LOW! Try again");
      }
      else if (guess > randomNumber)
      {
        System.out.println("TOO HIGH! Try again");
      }
      else 
      {
        System.out.printf("You have won! The number was %d\n", randomNumber);
        System.out.printf("Atempts - %d", attempts);
      }

    } while (guess != randomNumber);

  }
}
