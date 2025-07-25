public class Main {
  public static void main(String[] args) {

    System.out.println(bakePizza("flat bread"));
    System.out.println(bakePizza("flat bread", "mozzarella"));
    System.out.println(bakePizza("flat bread", "mozzarella", "pepperonni"));

  }
  static String bakePizza(String bread) {
    return bread + " pizza";
  }
  static String bakePizza(String bread, String cheese) {
    return cheese + " " + bread + " pizza";
  }
  static String bakePizza(String bread, String cheese, String toping) {
    return toping + " " + cheese + " " + bread + " pizza";
  }
}


