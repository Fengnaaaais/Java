import java.util.Scanner;

public class Program {

  public static void main (String args[]) {

    Scanner in = new Scanner(System.in);

    System.out.print("Сумма вклада: ");
    int num = in.nextInt();
    double procent = 1;
    if (num < 100) {
      procent += 0.5;
    }
    else if (num >= 100 && num <= 200) {
      procent += 0.7;
    }
    else {
      procent += 0.10;
    }
    num += procent;
    System.out.printf("%d", num);

    in.close();
  }
}

