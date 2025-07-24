import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String day;

    System.out.print("Enter the day of the week: ");
    day = in.nextLine();

    switch (day) {
      case "Monday", "Tuesday", "Wednesday", "Thursday", "Firday" ->
          System.out.println("It is weekday :)")
      case "Saturday", "Sunday" -> 
          System.out.prinln("It is weekend (:")
      default -> System.out.printf("%s is not a day of week", day);
    }

    in.close();
  }
}
