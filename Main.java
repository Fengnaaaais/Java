public class Main {
  public static void main(String[] args) {

    System.out.println(add(3, 5));
    System.out.println(add(3, 5, 2));
    System.out.println(add(3, 5, 2, 4));

  }

  static double add(double a, double b) {
    return a + b;
  }

  static double add(double a, double b, double c) {
    return a + b + c;
  }

  static double add(double a, double b, double c, double d) {
    return a + b + c + d;
  }
}
