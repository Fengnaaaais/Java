import java.util.Random;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int balance = 100;
    int bet;
    int payout;
    String[] row;

    System.out.println("***********************");
    System.out.println(" Welcome to Java Slots ");
    System.out.println(" Symbols: 🍒 🍉 🍋 🔔 🌟 ");
    System.out.println("***********************");

    while (balance > 0) {
      System.out.printf("Current balance: $%d\n", balance);
      System.out.print("Place your bet amount: ");
      bet = in.nextInt();
      if (bet > balance) {
        System.out.println("INSUFFICIENT FUNDS!");
        continue;
      } else if (bet <= 0) {
        System.out.println("Bet must be greather than 0!");
        continue;
      } else {
        balance -= bet;
      }

      System.out.println("Spinning...");
      row = spinRow();
      printRow(row);
      payout = getPayout(row, bet);
      if (payout > 0) {
        System.out.printf("You won $%d\n", payout);
        balance += payout;
      } else {
        System.out.println("You lose!");
      }
    }

    in.close();
  }

  static String[] spinRow() {
    String[] symbols = {"🍒", "🍉", "🍋", "🔔", "🌟"};
    String[] row = new String[3];
    Random random = new Random();

    for (int i = 0; i < row.length; i++) {
      row[i] = symbols[random.nextInt(symbols.length)];
    }
    return row;
  }

  static void printRow(String[] row) {
    System.out.println(" " + String.join(" | ", row));
  }

  static int getPayout(String[] row, int bet) {
    if (row[0].equals(row[1]) && row[1].equals(row[2])) {
      return switch(row[0]) {
        case "🍒" -> bet * 3;
        case "🍉" -> bet * 4;
        case "🍋" -> bet * 5;
        case "🔔" -> bet * 10;
        case "🌟" -> bet * 20;
          default -> 0;
      };
    }
    else if (row[0].equals(row[1]) || row[0].equals(row[2])) {
      return switch(row[0]) {
        case "🍒" -> bet * 2;
        case "🍉" -> bet * 3;
        case "🍋" -> bet * 4;
        case "🔔" -> bet * 5;
        case "🌟" -> bet * 10;
          default -> 0;
      };
    }
    else if (row[1].equals(row[2])) {
      return switch(row[1]) {
        case "🍒" -> bet * 2;
        case "🍉" -> bet * 3;
        case "🍋" -> bet * 4;
        case "🔔" -> bet * 5;
        case "🌟" -> bet * 10;
          default -> 0;
      };
    }
    return 0;
  }
}
