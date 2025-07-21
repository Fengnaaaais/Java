import java.util.Scanner;

public class Program {

  public static void main (String args[]) {

    Scanner in = new Scanner(System.in);

    System.out.print("Enter num: ");
    int num = in.nextInt();

    if (num == 5) {
      System.out.print("Your num equal 5\n");
    }
    else {
      System.out.print("Your num don't equal 5\n");
    }

    in.close();
  }
}

