public class Main {
    public static void main(String[] args) {
      System.out.println(sum(1, 4, 5, 3, 5));
    }

    static int sum(int ...numbers) {
      int sum = 0;

      for (int number : numbers) {
        sum += number;
      }

      return sum;

    }
}

