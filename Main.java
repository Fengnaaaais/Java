import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ArrayList<String> foods = new ArrayList<>();

    int numOfFoods;

    System.out.printf("How many foods would you like: ");
    numOfFoods = in.nextInt();
    in.nextLine();

    for (int i = 1; i <= numOfFoods; i++) {
      System.out.printf("Enter food #%d: ", i);
      foods.add(in.nextLine());
    }

    System.out.println(foods);

    in.close();
  }
}
