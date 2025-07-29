import java.util.ArrayList;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> fruits = new ArrayList<>();

    fruits.add("Apple");
    fruits.add("Orange");
    fruits.add("Banana");

    // fruits.remove(2); // - remove Banana
    // fruits.set(1, "Pineaple"); // - set Orange - Pineaple
    // System.out.println(fruits.get(0)); // get element by index
    // System.out.println(fruits.size());

    Collections.sort(fruits);
    System.out.println(fruits);
  }
}
