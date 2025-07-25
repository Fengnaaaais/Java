import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      String[] foods;
      int size;

      System.out.print("What # of food do you want?: ");
      size = in.nextInt();
      in.nextLine();

      foods = new String[size];

      for (int i = 0; i < foods.length; i++) {
        System.out.print("Enter a food: ");
        foods[i] = in.nextLine();
      }

      for (String food : foods) {
        System.out.println(food);
      }

      in.close();
    }
}

