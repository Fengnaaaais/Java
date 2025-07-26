import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);

      String[] fruits = {"apple", "orange", "banana"};

      System.out.print("Enter the element: ");
      String target = in.nextLine();
      boolean isFound = false;

      for (int i = 0; i < fruits.length; i++) {
        if (fruits[i].equals(target)) {
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

