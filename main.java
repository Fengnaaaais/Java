import java.util.Scanner;

public class Program {

  public static void main (String args[]) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = in.nextLine();

    System.out.print("Enter your age: ");
    int num = in.nextInt();

    System.out.printf("Name: %s\tAge: %d\n", name, num);

    in.close();
  }
}

