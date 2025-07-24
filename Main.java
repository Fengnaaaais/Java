import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    double num1;
    double num2;
    char operator;
    double result = 0;
    boolean validOperation = true;

    System.out.print("Enter the first number(Use a comma for decimal numbers (Russian locale).): ");
    num1 = in.nextDouble();

    System.out.print("Enter the operator(+, -, *, /, ^): ");
    operator = in.next().charAt(0);

    System.out.print("Enter the second number(Use a comma for decimal numbers (Russian locale)): ");
    num2 = in.nextDouble();

    switch (operator) {
      case '+' -> result = num1 + num2;
      case '-' -> result = num1 - num2;
      case '*' -> result = num1 * num2;
      case '/' -> {
        if (num2 == 0) {
          System.out.println("Cannot devide by zero!");
          validOperation = false;
        } else {
          result = num1 / num2;
        }
      }
      case '^' -> result = Math.pow(num1, num2);
      default -> {
        System.out.println("Operator " + operator + " does not excist");
        validOperation = false;
      }
    }

    if (validOperation) {
      System.out.println(result);
    }

    in.close();
  }
}
