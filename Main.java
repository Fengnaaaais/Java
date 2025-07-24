import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    // is pass or fail
    System.out.print("Enter your score: ");
    int score = in.nextInt();

    String passOrFail = (score >= 60) ? "PASS" : "FAIL";

    System.out.println(passOrFail);

    // is number odd or even
    System.out.print("Enter any number: ");
    int number = in.nextInt();

    String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

    System.out.printf("Your number is - %s\n", evenOrOdd);


    // Is a.m. or p.m.
    System.out.print("Enter your hours: ");
    int hours = in.nextInt();

    String timeOfDay = (hours < 12) ? "A.M." : "P.M.";

    System.out.println(timeOfDay);


    System.out.print("Enter a income: ");
    int income = in.nextInt();

    double taxRate = (income >= 40000) ? 0.25 : 0.15;
  
    System.out.printf("tax rate with income %d is %.2f\n", income, taxRate);

    in.close();
  }
}
