import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      int[] numbers = {1, 2, 4, 5, 2, 5, 0};

      System.out.print("Enter the element: ");
      int target = in.nextInt();
      boolean isFound = false;

      for (int i = 0; i < numbers.length; i++) {
        if (target == numbers[i]) {
          System.out.printf("Element found at index: %d\n", i);
          isFound = true;
          break;
        } 
      }

      if (!isFound) {
        System.out.println("Element not found in the array");
      }
      in.close();
    }
}

