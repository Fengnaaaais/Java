import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    try (Scanner in = new Scanner(System.in)) {
      System.out.print("Enter a number: ");
      int number = in.nextInt();
      System.out.println(number);
    } catch (InputMismatchException e) {
      System.out.println("That wasn't a number!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
