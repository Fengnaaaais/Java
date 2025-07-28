import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    HashMap<String, Double> map = new HashMap<>();

    String key;
    double value;
    String isRunning;

    do {
      System.out.print("Введите ключ: ");
      key = in.nextLine();

      if (map.containsKey(key)) {
        System.out.println("ПРЕДУПРЕЖДЕНИЕ! Вы перезаписали ключ");
        System.out.print("Останавится? (y/n): ");
        if (in.nextLine().toLowerCase().equals("y")) {
          continue;
        }
      }

      System.out.print("Введите значение: ");
      value = in.nextDouble();

      System.out.print("Добавить новую пару? (y/n): ");
      in.nextLine();
      isRunning = in.nextLine().toLowerCase();

      map.put(key, value);
    } while (isRunning.equals("y"));

    for (String key_value : map.keySet()) {
      System.out.printf("%s | %.2f\n", key_value, map.get(key_value));
    }

    in.close();
  }
}
